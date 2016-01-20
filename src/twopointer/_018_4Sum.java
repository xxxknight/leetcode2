package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _018_4Sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> res = new ArrayList<>();
		if (nums.length < 4) {
			return res;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int low = j + 1;
				int high = nums.length - 1;
				while (low < high) {
					if (low > j + 1 && nums[low] == nums[low - 1]) {
						low++;
						continue;
					}
					if (high < nums.length - 1 && nums[high] == nums[high + 1]) {
						high--;
						continue;
					}
					int sum = nums[i] + nums[j] + nums[low] + nums[high];
					if (sum == target) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[low]);
						list.add(nums[high]);
						res.add(list);
						low++;
						high--;
					} else if (sum > target) {
						high--;
					} else {
						low++;
					}

				}
			}
		}
		return res;

	}

}
