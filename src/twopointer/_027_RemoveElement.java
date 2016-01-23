package twopointer;

public class _027_RemoveElement {
	public int removeElement(int[] nums, int val) {
		if (null == nums || nums.length == 0) {
			return 0;
		}
		int newLen = 0;
		for (int num : nums) {
			if (num != val) {
				nums[newLen++] = num;
			}
		}
		return newLen;
	}
}
