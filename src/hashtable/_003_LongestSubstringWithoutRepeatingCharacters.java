package hashtable;

import java.util.HashSet;

/**
 * 子字符串指的是连续的串
 * 
 * @author founder
 * 
 */
public class _003_LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {

		int i = 0;
		int j = 0;
		int max = 0;
		HashSet<Character> set = new HashSet<>();
		while (i < s.length()) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				i++;
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(j));
				j++;
			}
		}
		return max;

	}

}
