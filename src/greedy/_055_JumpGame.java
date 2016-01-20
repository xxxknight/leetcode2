package greedy;

/**
 * 
 * @author founder
 * 
 */
public class _055_JumpGame {
	public boolean canJump(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		if (nums.length == 1)
			return true;
		int max = nums[0];

		for (int i = 1; i < nums.length - 1; i++) {
			if (max <= 0) {
				return false;
			}
			max = Math.max(max - 1, nums[i]);
		}
		return max > 0;
	}
}
