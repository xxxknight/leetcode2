package dp;

public class _304_RangeSumQuery2DImmutable {
	private int[][] sums = null;

	public _304_RangeSumQuery2DImmutable(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		sums = new int[row + 1][col + 1];
		sums[0][0] = 0;
		for (int i = 1; i <= col; i++) {
			sums[0][i] = 0;
		}
		for (int i = 1; i <= row; i++) {
			sums[i][0] = 0;
		}
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				sums[i][j] = sums[i - 1][j] + sums[i][j - 1]
						- sums[i - 1][j - 1] + matrix[i - 1][j - 1];
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1]
				- sums[row2 + 1][col1] + sums[row1][col1];
	}

}
