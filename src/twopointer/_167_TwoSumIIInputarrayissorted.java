package twopointer;

/**
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * Hide Company Tags Amazon Hide Tags Array Two Pointers Binary Search Hide
 * Similar Problems (M) Two Sum
 * 
 * 
 */

public class _167_TwoSumIIInputarrayissorted {
	public int[] twoSum(int[] numbers, int target) {
		if (null == numbers || numbers.length <= 1) {
			return null;
		}
		int start = 0;
		int end = numbers.length - 1;
		while (start < end) {
			if (numbers[start] + numbers[end] == target) {
				return new int[] { start + 1, end + 1 };
			} else if (numbers[start] + numbers[end] < target) {
				start++;
			} else {
				end--;
			}
		}
		return null;

	}

	public static void main(String[] args) {

	}

}
