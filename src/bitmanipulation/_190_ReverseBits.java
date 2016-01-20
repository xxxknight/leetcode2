package bitmanipulation;

public class _190_ReverseBits {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {

		int res = 0;
		int bit = 31;
		while (n != 0) {
			if ((n & 1) == 1) {
				res = res + (1 << bit);
			}
			n = n >>> 1; // 注意>>与>>>的区别
			bit--;
		}
		return res;
	}

}
