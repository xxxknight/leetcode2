package math;

/**
 * 3��19�η���������Χ������3���ݷ�
 * 
 * @author founder
 * 
 */
public class _326_PowerofThree {
	public boolean isPowerOfThree(int n) {
		return n <= 0 ? false : Math.pow(3, 19) % n == 0;
	}

}
