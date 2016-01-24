package math;

/**
 * 3的19次方是整数范围内最大的3的幂方
 * 
 * @author founder
 * 
 */
public class _326_PowerofThree {
	public boolean isPowerOfThree(int n) {
		return n <= 0 ? false : Math.pow(3, 19) % n == 0;
	}

}
