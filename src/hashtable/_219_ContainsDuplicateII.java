package hashtable;

import java.util.HashMap;

public class _219_ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (hs.containsKey(nums[i]) && Math.abs(hs.get(nums[i]) - i) <= k) {
				return true;
			} else {
				hs.put(nums[i], i);
			}
		}
		return false;
	}

}
