package twopointer;

public class _125_ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (null == s || s.length() == 0) {
			return true;
		}
		s = s.trim();
		s = s.toLowerCase();
		int len = s.length();
		int low = 0;
		int high = len - 1;
		while (low < high) {
			if (!((s.charAt(low) >= 'a' && s.charAt(low) <= 'z') || (s
					.charAt(low) >= '0' && s.charAt(low) <= '9'))) {
				low++;
			} else if (!((s.charAt(high) >= 'a' && s.charAt(high) <= 'z') || (s
					.charAt(high) >= '0' && s.charAt(high) <= '9'))) {
				high--;
			} else {
				if (s.charAt(low) == s.charAt(high)) {
					low++;
					high--;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
