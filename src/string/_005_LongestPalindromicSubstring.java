package string;

/**
 * �������ַ����мӡ�#���ķ�����ͬһ������ż�������
 * @author founder
 *
 */
public class _005_LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}
		int max = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			sb.append('#').append(c);
		}
		sb.append('#');
		// System.out.println(sb.toString());

		String res = "";
		int i = 1;
		int cnt = 1;
		while (i < sb.length()) {
			while (i - cnt >= 0 && i + cnt < sb.length()
					&& sb.charAt(i - cnt) == sb.charAt(i + cnt)) {
				cnt++;
			}
			cnt--;
			if (cnt > max) {
				max = cnt;
				res = s.substring((i - max) / 2, (i + max) / 2);	//ע���±�
			}
			i++;
			cnt = 1;
		}
		return res;
	}

}
