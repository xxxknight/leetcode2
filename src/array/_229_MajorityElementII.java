package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Boyer-Moore Majority Vote algorithm
 * 
 * @author founder
 * 
 */
public class _229_MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> rst = new ArrayList<Integer>();
		if (nums == null || nums.length == 0)
			return rst;
		int count1 = 0, count2 = 0, candidate1 = 0, candidate2 = 1;
		for (int num : nums) {
			if (num == candidate1)
				count1++;
			else if (num == candidate2)
				count2++;
			else if (count1 == 0) {
				candidate1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				candidate2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int num : nums) {
			if (num == candidate1)
				count1 += 2;
			else
				count1--;
			if (num == candidate2)
				count2 += 2;
			else
				count2--;
		}
		if (count1 > 0)
			rst.add(candidate1);
		if (count2 > 0)
			rst.add(candidate2);
		return rst;
	}

}
