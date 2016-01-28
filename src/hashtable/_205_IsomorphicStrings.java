package hashtable;

import java.util.HashMap;

/**
 * 判断字符是否一一对应
 * 
 * @author founder
 * 
 */
public class _205_IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if (null == s || s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> hs1 = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if (hs1.containsKey(s.charAt(i))
					&& !hs1.get(s.charAt(i)).equals(t.charAt(i))) {
				return false;
			}
			hs1.put(s.charAt(i), t.charAt(i));
		}
		hs1.clear();
		for (int i = 0; i < t.length(); i++) {
			if (hs1.containsKey(t.charAt(i))
					&& !hs1.get(t.charAt(i)).equals(s.charAt(i))) {
				return false;
			}
			hs1.put(t.charAt(i), s.charAt(i));
		}
		return true;
	}

	public boolean isIsomorphic2(String s, String t) {
		HashMap M = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			if (!M.containsKey(s.charAt(i)) && !M.containsValue(t.charAt(i))) {
				M.put(s.charAt(i), t.charAt(i));
			} else if (!M.containsKey(s.charAt(i))
					|| !M.get(s.charAt(i)).equals(t.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
