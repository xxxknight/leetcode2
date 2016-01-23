package math;

public class _066_PlusOne {
	public int[] plusOne(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			digits[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry == 1) {
			int[] res = new int[digits.length + 1];
			res[0] = 1;
			return res;
		} else {
			return digits;
		}
	}

}
