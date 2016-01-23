package array;

/**
 * ì³²¨À­ÇĞÊıÁĞ
 * 
 * @author founder
 * 
 */
public class _070_ClimbingStairs {
	public int climbStairs(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int a = 1;
		int b = 1;
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res = a + b;
			a = b;
			b = res;

		}
		return res;
	}

}
