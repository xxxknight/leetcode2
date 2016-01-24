package string;

/**
 * reverse the integer to determine if it is a palindromeNumber
 * 
 * @author founder
 * 
 */

public class _009_PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else if (x == 0) {
			return true;
		}
		int temp = x;
		int res = 0;
		while (x != 0) {
			if (res > Integer.MAX_VALUE) {
				return false;
			}
			res = res * 10 + x % 10;
			x /= 10;
		}
		if (temp == res) {
			return true;
		} else {
			return false;
		}
	}

}
