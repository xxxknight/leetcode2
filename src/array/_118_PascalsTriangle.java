package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Ñî»ÔÈý½Ç
 * @author founder
 * 
 */
public class _118_PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		if (numRows <= 0) {
			return res;
		}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		res.add(list1);
		for (int i = 1; i < numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(1);
			for (int j = 1; j < i; j++) {
				temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
			}
			temp.add(1);
			res.add(temp);
		}
		return res;

	}

}
