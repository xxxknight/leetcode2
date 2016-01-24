package bitmanipulation;

/**
 * ����һ��32λ���顣ÿһλ�洢ÿ��������λ���ϵĺ͡�����3�Ϳ�����������3�ε�����
 * @author founder
 * 
 */

public class _137_SingleNumberII {
	public int singleNumber(int[] nums) {
		int res = 0;
		int[] bits = new int[32];
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < nums.length; j++) {
				bits[i] += ((nums[j] >> i) & 1);
			}
			bits[i] %= 3;
			res |= (bits[i] << i);
		}
		return res;
	}

}
