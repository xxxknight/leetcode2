package sort;

import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it in-place such that nums[0] <=
 * nums[1] >= nums[2] <= nums[3]....
 * 
 * For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6,
 * 2, 5, 3, 4].
 * 
 * Hide Company Tags Google Hide Tags Array Sort Hide Similar Problems (M) Sort
 * Colors (M) Wiggle Sort II
 * 
 * 
 */
public class _280_WiggleSort {
	public void wiggleSort(int[] nums) {
		if (nums.length <= 1) {
			return;
		}
		for (int i = 1; i < nums.length; i++)
			if (i % 2 == 1) {
				if (nums[i - 1] > nums[i])
					swap(nums, i);
			} else if (nums[i - 1] < nums[i])
				swap(nums, i);
	}

	public void swap(int[] nums, int i) {
		int tmp = nums[i];
		nums[i] = nums[i - 1];
		nums[i - 1] = tmp;
	}

	public void wiggleSort2(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return;
		}
		Arrays.sort(nums);
		if (nums.length <= 2) {
			return;
		}
		for (int i = 1; i < nums.length - 1; i += 2) {
			swap2(nums, i);
		}
	}

	private void swap2(int[] nums, int i) {
		int temp = nums[i];
		nums[i] = nums[i + 1];
		nums[i + 1] = temp;
	}

}
