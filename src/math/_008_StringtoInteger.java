package math;

public class _008_StringtoInteger {
	public int myAtoi(String str) {
		str = str.trim();
		if (null == str || str.length() == 0) {
			return 0;
		}
		long res = 0;
		int flag = 1;
		int i = 0;
		char[] strs = str.toCharArray();
		if (strs[0] == '+') {
			i++;
		} else if (strs[0] == '-') {
			flag = -1;
			i++;
		}
		while (i < strs.length) {
			if (res * flag > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (res * flag < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			if (strs[i] <= '9' && strs[i] >= '0') {
				res = res * 10 + strs[i] - '0';
			} else {
				if (res == 0) {
					return 0;
				}
				break;
			}
			i++;
		}
		res = res * flag;
		if (res > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (res < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) res;

	}

}
