package hashtable;

import java.util.HashMap;

public class _001_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		if (null == nums || 0 == nums.length) {
			return res;
		}

		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hs.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (hs.containsKey(target - nums[i])) {
				res[0] = i + 1;
				res[1] = hs.get(target - nums[i]) + 1;
				if (res[0] == res[1]) {
					continue;
				} else {
					break;
				}
			}
		}
		return res;
	}

}
