package array;

/**
 * Given two sparse matrices A and B, return the result of AB.
 * 
 * You may assume that A's column number is equal to B's row number.
 * 
 * Example:
 * 
 * A = [ [ 1, 0, 0], [-1, 0, 3] ]
 * 
 * B = [ [ 7, 0, 0 ], [ 0, 0, 0 ], [ 0, 0, 1 ] ]
 * 
 * 
 * | 1 0 0 | | 7 0 0 | | 7 0 0 | AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 | | 0 0
 * 1 | Hide Company Tags LinkedIn Hide Tags Hash Table
 * 
 * 
 */
public class _311_SparseMatrixMultiplication {
	public int[][] multiply(int[][] A, int[][] B) {
		int Arow = A.length;
		int Bcol = B[0].length;
		int Brow = B.length;

		int[][] res = new int[Arow][Bcol];

		for (int i = 0; i < Arow; i++) {

			for (int k = 0; k < Brow; k++) {
				if (A[i][k] != 0) {
					for (int j = 0; j < Bcol; j++) {
						if (B[k][j] != 0) {
							res[i][j] += A[i][k] * B[k][j];
						}
					}

				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[][] A = new int[][] { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] B = new int[][] { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
		int[][] res = new _311_SparseMatrixMultiplication().multiply(A, B);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.println(res[i][j]);
			}
		}
	}
}
