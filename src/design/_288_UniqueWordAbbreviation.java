package design;

import java.util.HashMap;

/**
 * An abbreviation of a word follows the form <first letter><number><last
 * letter>. Below are some examples of word abbreviations:
 * 
 * a) it --> it (no abbreviation)
 * 
 * 1 b) d|o|g --> d1g
 * 
 * 1 1 1 1---5----0----5--8 c) i|nternationalizatio|n --> i18n
 * 
 * 1 1---5----0 d) l|ocalizatio|n --> l10n Assume you have a dictionary and
 * given a word, find whether its abbreviation is unique in the dictionary. A
 * word's abbreviation is unique if no other word from the dictionary has the
 * same abbreviation.
 * 
 * Example: Given dictionary = [ "deer", "door", "cake", "card" ]
 * 
 * isUnique("dear") -> false isUnique("cart") -> true isUnique("cane") -> false
 * isUnique("make") -> true Hide Company Tags Google Hide Tags Hash Table Design
 * Hide Similar Problems (E) Two Sum III - Data structure design (M) Generalized
 * Abbreviation
 * 
 * 
 */

public class _288_UniqueWordAbbreviation {
	HashMap<String, String> map;

	public _288_UniqueWordAbbreviation(String[] dictionary) {
		map = new HashMap<String, String>();
		for (String str : dictionary) {
			String key = form(str);
			// If there is more than one string belong to the same key
			// then the key will be invalid, we set the value to ""
			if (map.containsKey(key) && !map.get(key).equals(str))
				map.put(key, "");
			else
				map.put(key, str);
		}
	}

	public boolean isUnique(String word) {
		String key = form(word);
		return !map.containsKey(key) || map.get(key).equals(word);
	}

	public String form(String origin) {
		if (origin.length() <= 2) {
			return origin;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(origin.charAt(0)).append(origin.length() - 2)
				.append(origin.charAt(origin.length() - 1));
		return sb.toString();
	}

	public static void main(String[] args) {
		String[] strings = { "dog" };
		_288_UniqueWordAbbreviation test = new _288_UniqueWordAbbreviation(
				strings);
		System.out.println(test.isUnique("dig"));
	}

}
