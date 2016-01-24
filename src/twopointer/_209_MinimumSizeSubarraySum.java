package twopointer;

/**
 * 双指针法 和二分查找法
 * 
 * @author founder
 * 
 */
public class _209_MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		int min = Integer.MAX_VALUE;
		int j = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			while (j < nums.length && sum < s) {
				sum += nums[j++];
			}
			if (sum >= s) {
				if (j - i < min) {
					min = j - i;
				}
			}
			sum -= nums[i];
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}

	// 二分查找方法，数组存储到i的和
	public int minSubArrayLen2(int s, int[] nums) {
		int[] sums = new int[nums.length + 1];
		for (int i = 1; i < sums.length; i++)
			sums[i] = sums[i - 1] + nums[i - 1];
		int minLen = Integer.MAX_VALUE;
		for (int i = 0; i < sums.length; i++) {
			int end = binarySearch(i + 1, sums.length - 1, sums[i] + s, sums);
			if (end == sums.length)
				break;
			if (end - i < minLen)
				minLen = end - i;
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}

	private int binarySearch(int lo, int hi, int key, int[] sums) {
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (sums[mid] >= key) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

}
