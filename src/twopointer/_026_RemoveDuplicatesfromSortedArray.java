package twopointer;

/**
 * ˫ָ��
 * @author founder
 *
 */
public class _026_RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int i = 0;	//i��¼�仯��ĳ���
		for (int n : nums) {
			if (i < 1 || n > nums[i - 1]) {
				nums[i++] = n;
			}
		}
		return i;
	}

}
