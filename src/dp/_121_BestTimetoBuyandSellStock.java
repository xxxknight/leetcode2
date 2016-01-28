package dp;

public class _121_BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		int max = 0;
		int minP = Integer.MAX_VALUE;	//存储i之前最小的价格
		for (int i = 0; i < prices.length; i++) {
			minP = Math.min(minP, prices[i]);
			max = Math.max(max, prices[i] - minP);
		}
		return max;
	}

}
