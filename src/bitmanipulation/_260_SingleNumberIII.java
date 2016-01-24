package bitmanipulation;

/**
 * �ҵ������������Ϊ1��1λ���з��飬�������е�����Ϊ���顣ת��ΪsingleNumber1
 * 
 * @author founder
 * 
 */
public class _260_SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		int AxorB = 0;
		for (int i = 0; i < nums.length; i++) {
			AxorB ^= nums[i];
		}
		int[] res = new int[2];
		int mask = 1;
		while ((mask & AxorB) == 0) {
			mask <<= 1;
		}
		for (int i = 0; i < nums.length; i++) {
			if ((mask & nums[i]) == 0) {
				res[0] ^= nums[i];
			} else {
				res[1] ^= nums[i];
			}
		}
		return res;
	}

}
