package greedy;

public class _330_PatchingArray {
	public int minPatches(int[] nums, int n) {
		long sum = 1;
		int cnt = 0;
		int i = 0;
		while (sum <= n) {
			if (i < nums.length && nums[i] <= sum) {
				sum += nums[i++];
			} else {
				sum += sum;
				cnt++;
			}
		}
		return cnt;
	}

}
