package twopointer;

import java.util.Arrays;

/**
 * Given an array of n integers nums and a target, find the number of index
 * triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] +
 * nums[j] + nums[k] < target.
 * 
 * For example, given nums = [-2, 0, 1, 3], and target = 2.
 * 
 * Return 2. Because there are two triplets which sums are less than 2:
 * 
 * [-2, 0, 1] [-2, 0, 3] Follow up: Could you solve it in O(n2) runtime?
 * 
 * Hide Company Tags Google Hide Tags Array Two Pointers Hide Similar Problems
 * (M) 3Sum (M) 3Sum Closest
 * 
 * 
 */

public class _259_3SumSmaller {
	public int threeSumSmaller(int[] nums, int target) {
		if (null == nums || nums.length <= 2) {
			return 0;
		}
		int cnt = 0;
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			int start = i + 1;
			int end = len - 1;
			while (start < end) {
				if (nums[i] + nums[start] + nums[end] < target) {
					cnt+=(end-start);
					start++;
				} else {
					end--;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(new _259_3SumSmaller().threeSumSmaller(new int[] {
				3, 1, 0, -2 }, 4));
	}

}
