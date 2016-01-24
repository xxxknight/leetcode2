package hashtable;

import java.util.HashMap;

public class _217_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hs.containsKey(nums[i])) {
				return true;
			} else {
				hs.put(nums[i], 1);
			}
		}
		return false;
	}
}
