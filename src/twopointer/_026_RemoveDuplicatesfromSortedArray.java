package twopointer;

/**
 * 双指针
 * @author founder
 *
 */
public class _026_RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int i = 0;	//i记录变化后的长度
		for (int n : nums) {
			if (i < 1 || n > nums[i - 1]) {
				nums[i++] = n;
			}
		}
		return i;
	}

}
