package dp;

public class _303_RangeSumQueryImmutable {
	private int[] sum;

	public _303_RangeSumQueryImmutable(int[] nums) {
		sum = nums;
		for (int i = 1; i < nums.length; i++) {
			sum[i] += nums[i - 1];
		}
	}

	public int sumRange(int i, int j) {
		return (i == 0) ? sum[j] : sum[j] - sum[i - 1];
	}

}
