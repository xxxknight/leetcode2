package dp;

/**
 * There is a fence with n posts, each post can be painted with one of the k
 * colors.
 * 
 * You have to paint all the posts such that no more than two adjacent fence
 * posts have the same color.
 * 
 * Return the total number of ways you can paint the fence.
 * 
 * Note: n and k are non-negative integers.
 * 
 * Hide Company Tags Google Hide Tags Dynamic Programming Hide Similar Problems
 * (E) House Robber (M) House Robber II (M) Paint House (H) Paint House II
 * 
 * 
 */

public class _276_PaintFence {
	public int numWays(int n, int k) {
		if (n <= 0 || k <= 0) {
			return 0;
		}
		if (n == 1) {
			return k;
		}
		if (n == 2) {
			return k * k;
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = k;
		dp[2] = k * k;
		for (int i = 3; i <= n; i++) {
			dp[i] = (k - 1) * (dp[i - 1] + dp[i - 2]);
		}
		return dp[n];
	}

	public int numWays2(int n, int k) {
		// 当n=0时返回0
		int dp[] = { 0, k, k * k, 0 };
		if (n <= 2) {
			return dp[n];
		}
		for (int i = 2; i < n; i++) {
			// 递推式：第三根柱子要么根第一个柱子不是一个颜色，要么跟第二根柱子不是一个颜色
			dp[3] = (k - 1) * (dp[1] + dp[2]);
			dp[1] = dp[2];
			dp[2] = dp[3];
		}
		return dp[3];
	}

	public static void main(String[] args) {

	}

}
