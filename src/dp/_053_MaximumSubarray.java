package dp;

/**
 * 求数组中连续数字的最大和
 * @author founder
 * 
 */
public class _053_MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}

		return max;
	}

}
