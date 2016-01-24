package dp;

public class _091_DecodeWays {
	public int numDecodings(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0') {
			return 0;
		}
		int len = s.length();
		int nums[] = new int[len + 1];
		nums[0] = 1;
		nums[1] = 1;
		for (int i = 2; i <= len; i++) {
			if (s.charAt(i - 1) != '0') {
				nums[i] = nums[i - 1];
			}
			if (s.charAt(i - 2) != '0') {
				if (Integer.parseInt(s.substring(i - 2, i)) <= 26
						&& Integer.parseInt(s.substring(i - 2, i)) >= 10) {
					nums[i] += nums[i - 2];
				}
			}
		}
		return nums[len];
	}

}
