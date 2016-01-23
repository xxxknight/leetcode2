package math;

import java.util.HashSet;
import java.util.Set;

public class _202_HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (n != 1) {
			int sum = 0;
			while (n != 0) {
				int mod = n % 10;
				n /= 10;
				sum += mod * mod;
			}
			if (set.contains(sum)) {
				return false;
			}
			set.add(sum);
			n = sum;
		}
		return true;
	}

}
