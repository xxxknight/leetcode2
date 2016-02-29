package dp;

/**
 * There are a row of n houses, each house can be painted with one of the k
 * colors. The cost of painting each house with a certain color is different.
 * You have to paint all the houses such that no two adjacent houses have the
 * same color.
 * 
 * The cost of painting each house with a certain color is represented by a n x
 * k cost matrix. For example, costs[0][0] is the cost of painting house 0 with
 * color 0; costs[1][2] is the cost of painting house 1 with color 2, and so
 * on... Find the minimum cost to paint all houses.
 * 
 * Note: All costs are positive integers.
 * 
 * Follow up: Could you solve it in O(nk) runtime?
 * 
 * Hide Company Tags Facebook Hide Tags Dynamic Programming Hide Similar
 * Problems (M) Product of Array Except Self (H) Sliding Window Maximum (M)
 * Paint House (E) Paint Fence
 * 
 * 
 */

public class _265_PaintHouseII {
	
	public int minCostII(int[][] costs) {
		if (costs== null || costs.length == 0 ) {
			return 0;
		}
		int k = costs[0].length;
		int[] last = new int[k];
		int[] cur = new int[k];
		for (int i = 0; i < k; i++) {
			last[i] = costs[0][i];
		}
		for (int j = 0; j < cur.length; j++) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < k; i++) {
				cur[i] = Math.min(a, b)
			}
			
		}
		

	}

	public static void main(String[] args) {

	}

}
