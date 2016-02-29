package dp;

/**
 * There are a row of n houses, each house can be painted with one of the three
 * colors: red, blue or green. The cost of painting each house with a certain
 * color is different. You have to paint all the houses such that no two
 * adjacent houses have the same color.
 * 
 * The cost of painting each house with a certain color is represented by a n x
 * 3 cost matrix. For example, costs[0][0] is the cost of painting house 0 with
 * color red; costs[1][2] is the cost of painting house 1 with color green, and
 * so on... Find the minimum cost to paint all houses.
 * 
 * Note: All costs are positive integers.
 * 
 * Hide Company Tags LinkedIn Hide Tags Dynamic Programming Hide Similar
 * Problems (E) House Robber (M) House Robber II (H) Paint House II (E) Paint
 * Fence
 * 
 * 
 */

//斐波拉切数列的增强版。DP中不建立dp数组，仅保存相关的值。
public class _256_PaintHouse {
	public int minCost(int[][] costs) {
		if (null == costs || costs.length == 0) {
			return 0;
		}
		int lastR = costs[0][0];
		int lastB = costs[0][1];
		int lastG = costs[0][2];

		for (int i = 1; i < costs.length; i++) {
			int curR = Math.min(lastB, lastG) + costs[i][0];
			int curB = Math.min(lastR, lastG) + costs[i][1];
			int curG = Math.min(lastR, lastB) + costs[i][2];
			lastR = curR;
			lastB = curB;
			lastG = curG;
		}

		return Math.min(Math.min(lastB, lastG), lastR);
	}

	public static void main(String[] args) {

	}

}
