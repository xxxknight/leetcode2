package greedy;

/**
 * 
 * @author founder
 * 
 */
public class _045_JumpGameII {
	public int jump(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return -1;
		}
		if (nums.length == 1) {
			return 0;
		}
		int curD = 0;	//记录目前能到达的最远距离
		int lastD = 0;	//记录上一次跳前能到达的最远距离
		int step = 0;	//记录所需步数

		for (int i = 0; i < nums.length; i++) {
			if(i > curD){	//如果当前所到的距离超过了curD,则返回-1
                return -1;
            }
			if (i > lastD) {	//如果当前所到的距离超过了lastD所能达到的距离，则更新lastD,步数加一
				lastD = curD;
				step++;
			}
			curD = Math.max(curD, nums[i] + i);	//每次更新步数，只当lastD不够用时才用到
		}
		return step;
	}

}
