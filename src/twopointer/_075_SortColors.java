package twopointer;

/**
 * 双指针的变种
 * @author founder
 *
 */
public class _075_SortColors {
	public void sortColors(int[] nums) {
		int index0 = 0;
		int index1 = 0;
		int index2 = nums.length - 1;
		while (index1 <= index2) {
			if (nums[index1] == 0) {
				nums[index1++] = nums[index0];
				nums[index0++] = 0;
			} else if (nums[index1] == 2) {
				nums[index1] = nums[index2];
				nums[index2--] = 2;
			} else {
				index1++;
			}

		}

	}

}
