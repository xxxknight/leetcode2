package bitmanipulation;

/**
 * ÀàËÆsingleNumber1
 * @author founder
 *
 */
public class _268_MissingNumber {
	public int missingNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res ^= i;
			res ^= nums[i];
		}
		res ^= nums.length;
		return res;
	}

}
