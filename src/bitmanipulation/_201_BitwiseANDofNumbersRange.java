package bitmanipulation;

public class _201_BitwiseANDofNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		int diffDigit = 0;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			diffDigit++;
		}
		return n << diffDigit;
	}

}
