package sort;

import java.util.Arrays;

public class _324_WiggleSortII {
	public void wiggleSort(int[] nums) {
		Arrays.sort(nums); // [1,1,1,4,5,6]
		int n = nums.length, mid = n % 2 == 0 ? n / 2 - 1 : n / 2;
		int[] temp = Arrays.copyOf(nums, n);
		int index = 0;
		for (int i = 0; i <= mid; i++) {
			nums[index] = temp[mid - i];
			if (index + 1 < n)// avoid out of boundary
				nums[index + 1] = temp[n - i - 1];
			index += 2;
		}
		// [1, 6, 1, 5, 1, 4]
	}

	public static void main(String[] args) {
		new _324_WiggleSortII().wiggleSort(new int[] { 1, 5, 1, 1, 6, 4 });
	}

}
