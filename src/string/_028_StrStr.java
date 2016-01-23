package string;

/**
 * 查找子字符串基本方法
 * @author founder
 *
 */
public class _028_StrStr {
	public int strStr(String haystack, String needle) {
		char[] h = haystack.toCharArray();
		char[] n = needle.toCharArray();

		int i = 0;
		int j = 0;

		while (i < h.length && j < n.length) {
			if (h[i] == n[j]) {
				i++;
				j++;
			} else {
				i = i - j + 1;
				j = 0;

			}
		}
		if (j >= n.length) {
			return i - j;
		}
		return -1;
	}
}
