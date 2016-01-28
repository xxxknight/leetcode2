package math;

/**
 * 26进制转10进制
 * @author founder
 *
 */
public class _171_ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int result = 0;
		char[] strs = s.toCharArray();
		for (int i = 0; i < strs.length; i++) {
			result = result * 26 + (strs[i] - 'A' + 1);
		}
		return result;
	}

}
