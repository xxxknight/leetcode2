package binarysearch;

public class _035_SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		if (target > nums[high]) {
			return nums.length;
		}
		if (target < nums[low]) {
			return 0;
		}
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (target > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

}
