package math;

import java.util.HashMap;

/**
 * 
 * @author founder
 *
 */
public class _013_RomantoInteger {
	public int romanToInt(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int res = map.get(s.charAt(s.length() - 1));
		int tmp = res;
		for (int i = s.length() - 2; i >= 0; i--) {
			int cur = map.get(s.charAt(i));
			res = cur >= tmp ? (res + cur) : (res - cur);	//�ؼ�����
			tmp = cur;
		}
		return res;

	}

}
