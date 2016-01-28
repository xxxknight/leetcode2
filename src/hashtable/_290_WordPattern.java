package hashtable;

import java.util.HashMap;

/**
 * 与205题一样
 * 
 * @author founder
 * 
 */
public class _290_WordPattern {
	public boolean wordPattern(String pattern, String str) {
		if (pattern == null || str == null) {
			return true;
		}
		String[] arr = str.split(" ");
		if (arr.length != pattern.length()) {
			return false;
		}

		int len = pattern.length();
		HashMap<Character, String> hs1 = new HashMap<Character, String>();
		for (int i = 0; i < len; i++) {
			if (hs1.containsKey(pattern.charAt(i))
					&& !hs1.get(pattern.charAt(i)).equals(arr[i])) {
				return false;
			}
			hs1.put(pattern.charAt(i), arr[i]);
		}
		HashMap<String, Character> hs2 = new HashMap<String, Character>();
		for (int i = 0; i < len; i++) {
			if (hs2.containsKey(arr[i]) && hs2.get(arr[i]) != pattern.charAt(i)) {
				return false;
			}
			hs2.put(arr[i], pattern.charAt(i));
		}

		return true;
	}

}
