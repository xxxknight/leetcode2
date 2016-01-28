package dp;

public class _322_CoinChange {
	public int coinChange(int[] coins, int amount) {
		if (coins == null || coins.length == 0) {
			return -1;
		}
		if (amount == 0) {
			return 0;
		}
		long[] f = new long[amount + 1];
		for (int i = 0; i < f.length; i++) {
			f[i] = Integer.MAX_VALUE;
		}
		f[0] = 0;
		for (int i = 1; i < f.length; i++) {
			for (int c = 0; c < coins.length; c++) {
				if (i - coins[c] >= 0) {
					f[i] = Math.min(f[i], f[i - coins[c]] + 1);
				}
			}
		}
		return (f[f.length - 1] == Integer.MAX_VALUE) ? -1
				: (int) f[f.length - 1];
	}

}
