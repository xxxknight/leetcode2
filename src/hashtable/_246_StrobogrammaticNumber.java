package hashtable;

import java.util.HashMap;

/**
 * A strobogrammatic number is a number that looks the same when rotated 180
 * degrees (looked at upside down).
 * 
 * Write a function to determine if a number is strobogrammatic. The number is
 * represented as a string.
 * 
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 * 
 * Hide Company Tags Google Hide Tags Hash Table Math Hide Similar Problems (M)
 * Strobogrammatic Number II (H) Strobogrammatic Number III
 * 
 * 
 */
public class _246_StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		if (num == null || num.length() == 0) {
			return true;
		}
		HashMap<Character, Character> map = new HashMap<>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('8', '8');
		map.put('9', '6');
		int start = 0;
		int end = num.length() - 1;
		while (start <= end) {
			if (isLegalDigit(num.charAt(start))
					&& isLegalDigit(num.charAt(end))
					&& num.charAt(start) == map.get(num.charAt(end))) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		return true;

	}

	private boolean isLegalDigit(char c) {
		if (c == '0' || c == '1' || c == '6' || c == '8' || c == '9') {
			return true;
		} else {
			return false;
		}

	}

	public boolean isStrobogrammatic2(String num) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('1', '1');
		map.put('0', '0');
		map.put('6', '9');
		map.put('9', '6');
		map.put('8', '8');
		int left = 0, right = num.length() - 1;
		while (left <= right) {
			// 如果字母不存在映射或映射不对，则返回假
			if (!map.containsKey(num.charAt(right))
					|| num.charAt(left) != map.get(num.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new _246_StrobogrammaticNumber()
				.isStrobogrammatic("818"));

	}

}
