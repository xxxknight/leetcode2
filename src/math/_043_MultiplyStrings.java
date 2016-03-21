package math;

/**
 * ×Ö·û´®Ä£Äâ³Ë·¨
 * 
 * @author founder
 * 
 */

public class _043_MultiplyStrings {
	public String multiply(String num1, String num2) {
		if (num1 == null || num2 == null || "0".equals(num1)
				|| "0".equals(num2)) {
			return "0";
		}

		int len1 = num1.length();
		int len2 = num2.length();
		int[] res = new int[len1 + len2];

		for (int i = len1 - 1; i >= 0; i--) {
			for (int j = len2 - 1; j >= 0; j--) {
				res[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = len1 + len2 - 2; i > 0; i--) {
			int num = res[i] % 10;
			sb.insert(0, num);
			int carry = res[i] / 10;
			res[i - 1] += carry;
		}
		sb.insert(0, res[0]);
		return sb.toString();
	}

	public String multiply2(String num1, String num2) {
		int m = num1.length(), n = num2.length();
		int[] pos = new int[m + n];

		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = mul + pos[p2];

				pos[p1] += sum / 10;
				pos[p2] = (sum) % 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int p : pos)
			if (!(sb.length() == 0 && p == 0))
				sb.append(p);
		return sb.length() == 0 ? "0" : sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new _043_MultiplyStrings().multiply("99", "99"));
	}

}
