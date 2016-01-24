package twopointer;

/**
 * ����������洢�����ַ������ַ������ͨ���ж��Ƿ������������ָ����ƶ�
 * @author founder
 *
 */
public class _076_MinimumWindowSubstring {
	public String minWindow(String s, String t) {
		int[] target = new int[256];
		int[] source = new int[256];
		for (char c : t.toCharArray()) {
			target[c]++;
		}
		String res = "";
		int min = Integer.MAX_VALUE;
		int end = 0;
		for (int start = 0; start < s.length(); start++) {
			while (end < s.length() && !isCovered(source, target)) {
				source[s.charAt(end)]++;
				end++;
			}
			if (isCovered(source, target)) {
				if (end - start + 1 < min) {
					min = end - start + 1;
					res = s.substring(start, end);
				}
			}
			source[s.charAt(start)]--;
		}
		return res;
	}

	public boolean isCovered(int[] source, int[] target) {
		for (int i = 0; i < 256; i++) {
			if (target[i] > source[i]) {
				return false;
			}
		}
		return true;
	}

}
