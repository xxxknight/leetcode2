package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Given a string, we can "shift" each of its letter to its successive letter,
 * for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:
 * 
 * "abc" -> "bcd" -> ... -> "xyz" Given a list of strings which contains only
 * lowercase alphabets, group all strings that belong to the same shifting
 * sequence.
 * 
 * For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
 * Return:
 * 
 * [ ["abc","bcd","xyz"], ["az","ba"], ["acef"], ["a","z"] ] Note: For the
 * return value, each inner list's elements must follow the lexicographic order.
 * 
 * Hide Company Tags Google Uber Hide Tags Hash Table String Hide Similar
 * Problems (M) Group Anagrams
 * 
 * 
 */
public class _249_GroupShiftedStrings {
	public List<List<String>> groupStrings(String[] strings) {
		List<List<String>> res = new ArrayList<List<String>>();
		if (strings == null || strings.length == 0) {
			return res;
		}
		Arrays.sort(strings);
		HashMap<String, List<String>> map = new HashMap<>();
		for (String string : strings) {
			String temp = convention(string);
			if (map.containsKey(temp)) {
				map.get(temp).add(string);
			} else {
				List<String> list = new ArrayList<>();
				list.add(string);
				map.put(temp, list);
			}
		}
		Iterator<List<String>> iterator = map.values().iterator();
		while (iterator.hasNext()) {
			res.add(iterator.next());
		}
		return res;
	}

	public String convention(String origin) {
		char[] chars = origin.toCharArray();
		int diff = chars[0] - 'a';
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			char c = (char) ((chars[i] - diff) < 'a' ? (chars[i] - diff + 26)
					: (chars[i] - diff));
			sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new _249_GroupShiftedStrings().groupStrings(new String[]{"a"}));

	}

}
