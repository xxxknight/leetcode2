package binarysearch;

/**
 * 从右上角开始
 * @author founder
 * 
 */
public class _074_Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int start = 0;
		int row = 0;
		int col = n - 1;
		while (row < m && col >= 0) {
			start = matrix[row][col];
			if (start == target) {
				return true;
			} else if (target > start) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}

}
