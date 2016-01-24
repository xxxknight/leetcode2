package twopointer;

public class _283_MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (null == nums || nums.length < 1) {
			return;
		}
		int j = 0;	//j指向非零数字
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = 0;
				nums[j++] = temp;
			}
		}

	}

}
