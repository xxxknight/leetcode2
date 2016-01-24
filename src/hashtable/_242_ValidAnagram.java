package hashtable;

public class _242_ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (null == s && null == t) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}
		int[] res = new int[26];
		for (int i = 0; i < s.length(); i++) {
			res[s.charAt(i) - 'a']++;
			res[t.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (res[i] != 0) {
				return false;
			}
		}

		return true;

	}

}
