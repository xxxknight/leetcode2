package math;

public class _007_ReverseInteger {
	public int reverse(int x) {
		int flag = 1;
		if (x < 0) {
			flag = -1;
		} else if (x == 0) {
			return 0;
		}
		x = Math.abs(x);
		long res = 0;
		while (x > 0) {
			int temp = x % 10;
			res = res * 10 + temp;
			x /= 10;
		}
		res = res * flag;
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) res;
	}

}
