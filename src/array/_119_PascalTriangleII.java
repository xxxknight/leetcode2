package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 即有规律的重现杨辉三角的构造过程
 * 
 * @author founder
 * 
 */
public class _119_PascalTriangleII {
	// 方法1：效率高一点
	public List<Integer> getRow(int k) {
		Integer[] arr = new Integer[k + 1];
		Arrays.fill(arr, 0);
		arr[0] = 1;

		for (int i = 1; i <= k; i++)
			for (int j = i; j > 0; j--)
				arr[j] = arr[j] + arr[j - 1];

		return Arrays.asList(arr);
	}

	// 方法2：不用借助数组，省点空间
	public List<Integer> getRow2(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		if (rowIndex < 0) {
			return res;
		}
		for (int i = 0; i <= rowIndex; i++) {
			res.add(1);
			for (int j = i - 1; j > 0; j--) {
				res.set(j, res.get(j) + res.get(j - 1));
			}
		}
		return res;
	}

}
