package greedy;

/**
 * 注：贪心算法
 * @author founder
 *
 */

public class _134_GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas.length == 0 || cost.length == 0 || gas.length != cost.length) {
			return -1;
		}
		int tank = 0, total = 0, start = 0;
		for (int i = 0; i < gas.length; ++i) {

			total += (gas[i] - cost[i]);	//记录整个过程的耗油情况
			tank += (gas[i] - cost[i]);	    //记录邮箱中的剩余油
			if (tank < 0) {					//当油量少于0时，更换起点，i前面的节点均不能不为起点，不必回到开头点。并清空油箱中的油量
				start = i + 1;
				tank = 0;
			}

		}
		return total < 0 ? -1 : start;		//判断整个过程的油耗是否小于0？只要油耗>=0，则一定存在起始点。
	}

}
