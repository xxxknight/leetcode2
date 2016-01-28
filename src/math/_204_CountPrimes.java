package math;

import java.util.Arrays;

/**
 * 利用一个标志数组标识是否是质数
 * @author founder
 *
 */
public class _204_CountPrimes {
	public int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		Arrays.fill(notPrime, false);		//初始默认均为质数，
		int cnt = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i]) {				//如果不是质数就继续
				continue;
			}
			cnt++;							//如果是质数就加一
			for (int j = i; j < n; j += i) {
				notPrime[j] = true;			//将该质数的倍数全部置为true
			}
		}
		return cnt;
	}

}
