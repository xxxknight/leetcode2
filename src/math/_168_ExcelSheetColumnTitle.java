package math;

/**
 * 10进制转26进制
 * @author founder
 *
 */
public class _168_ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		char[] dict = { 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y' };
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int remainder = n % 26;
			sb.insert(0, dict[remainder]);
			if (remainder == 0) {
				n--;
			}
			n = n / 26;
		}
		return sb.toString();
	}

}
