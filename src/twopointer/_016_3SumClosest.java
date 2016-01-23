package twopointer;

import java.util.Arrays;

public class _016_3SumClosest {
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3) {
			return -1;
		}
		Arrays.sort(nums);
		int res = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int low = i + 1;
			int high = nums.length - 1;
			while (low < high) {
				int sum = nums[low] + nums[high] + nums[i];
				if (sum == target) {
					return sum;
				}
				if (Math.abs(sum - target) < min) {
					min = Math.abs(sum - target);
					res = sum;
				} else if (sum > target) {
					high--;
				} else {
					low++;
				}

			}
		}
		return res;
	}

}
