package dp;

import java.util.Arrays;

public class _313_SuperUglyNumber {
	public int nthSuperUglyNumber(int n, int[] primes) {
        int[] indexs = new int[primes.length];
		Arrays.fill(indexs, 0);
		int[] dp = new int[n];
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < indexs.length; j++) {
				if (dp[indexs[j]] * primes[j] < min) {
					min = dp[indexs[j]] * primes[j];
				}
			}
			
			dp[i] = min;
			for(int k = 0; k < indexs.length; k++){
				if (dp[indexs[k]] * primes[k] == min) {
					min = dp[indexs[k]] * primes[k];
					indexs[k]++;
				}
			}
		}
		return dp[n - 1];
    }

}
