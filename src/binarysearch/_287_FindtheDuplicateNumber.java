package binarysearch;

public class _287_FindtheDuplicateNumber {
	public int findDuplicate(int[] nums) {
		int low = 1;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int count = 0;
			for (int num : nums) {	//寻找数组中比mid小的数的个数，以确定重复数字的范围在mid的哪一边
				if (num <= mid) {
					count++;
				}
			}
			if (count > mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return low;
	}

}
