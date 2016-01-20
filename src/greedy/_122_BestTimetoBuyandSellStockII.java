package greedy;

/**
 * 
 * @author founder
 * 
 */
public class _122_BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			sum += (prices[i] - prices[i - 1]) > 0 ? (prices[i] - prices[i - 1])
					: 0;
		}
		return sum;
	}
}
