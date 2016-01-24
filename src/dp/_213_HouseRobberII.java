package dp;

import java.util.Arrays;

public class _213_HouseRobberII {
	public int rob(int[] nums) {
		if (null == nums || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		// 分成两种情况，一种包含最后一个房子，另一种不包含最后一个房子。
		// 包含最后一个房子
		int[] dp = new int[nums.length];
		dp[0] = 0;
		dp[1] = nums[1];
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}
		int max1 = dp[nums.length - 1];

		// 不包含最后一个房子
		Arrays.fill(dp, 0);
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length - 1; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}
		int max2 = dp[nums.length - 2];
		return Math.max(max1, max2);
	}

}
