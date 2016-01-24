package bitmanipulation;

public class _191_Numberof1Bits {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);	//该技巧常用
			count++;
		}
		return count;
	}

}
