package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums and a target value k, find the maximum length of a
 * subarray that sums to k. If there isn't one, return 0 instead.
 * 
 * Example 1: Given nums = [1, -1, 5, -2, 3], k = 3, return 4. (because the
 * subarray [1, -1, 5, -2] sums to 3 and is the longest)
 * 
 * Example 2: Given nums = [-2, -1, 2, 1], k = 1, return 2. (because the
 * subarray [-1, 2] sums to 1 and is the longest)
 * 
 * Follow Up: Can you do it in O(n) time?
 * 
 * Hide Company Tags Palantir Hide Tags Hash Table Hide Similar Problems (M)
 * Minimum Size Subarray Sum (E) Range Sum Query - Immutable
 * 
 * 
 */
public class _325_MaximumSizeSubarraySumEqualsk {
	public int maxSubArrayLen(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int sum = 0;
		int max = 0;
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i]; // sum里面存的就是所有的数字；
			if (sum == k) {
				max = i + 1;
			}
			if (!hs.containsKey(sum)) {
				hs.put(sum, i);
			}
			if (hs.containsKey(sum - k)) {
				max = Math.max(max, i - hs.get(sum - k));
			}
		}
		return max;
	}

	public int maxSubArrayLen2(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int res = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == k) {
				res = Math.max(i + 1, res);
			}
			int sum = nums[i] + k;
			if (map.containsKey(sum)) {
				res = Math.max(res, map.get(sum) - i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new _325_MaximumSizeSubarraySumEqualsk()
				.maxSubArrayLen(
						new int[] { -5, 8, 2, -1, 6, -3, 7, 1, 8, -2, 7 }, -4));
	}

}
