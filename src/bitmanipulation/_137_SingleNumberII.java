package bitmanipulation;

/**
 * 构建一个32位数组。每一位存储每个数各个位数上的和。除以3就可以消掉出现3次的数。
 * @author founder
 * 
 */

public class _137_SingleNumberII {
	public int singleNumber(int[] nums) {
		int res = 0;
		int[] bits = new int[32];
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < nums.length; j++) {
				bits[i] += ((nums[j] >> i) & 1);
			}
			bits[i] %= 3;
			res |= (bits[i] << i);
		}
		return res;
	}

}
