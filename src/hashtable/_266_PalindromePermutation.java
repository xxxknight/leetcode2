package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Given a string, determine if a permutation of the string could form a
 * palindrome.
 * 
 * For example, "code" -> False, "aab" -> True, "carerac" -> True.
 * 
 * Hint:
 * 
 * Consider the palindromes of odd vs even length. What difference do you
 * notice? Count the frequency of each character. If each character occurs even
 * number of times, then it must be a palindrome. How about character which
 * occurs odd number of times?
 * 
 * tag:easy lock
 */
public class _266_PalindromePermutation {
	public boolean canPermutePalindrome(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) {
				hs.remove(s.charAt(i));
			} else {
				hs.add(s.charAt(i));
			}
		}
		return hs.size() <= 1;
	}

	public boolean canPermutePalindrome2(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		int oddNum = 0;
		Iterator<Integer> iterator = map.values().iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i % 2 == 1) {
				oddNum++;
			}
			if (oddNum > 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new _266_PalindromePermutation()
				.canPermutePalindrome("as"));
	}

}
