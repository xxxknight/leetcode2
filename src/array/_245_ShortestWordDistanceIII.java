package array;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a follow up of Shortest Word Distance. The only difference is now
 * word1 could be the same as word2.
 * 
 * Given a list of words and two words word1 and word2, return the shortest
 * distance between these two words in the list.
 * 
 * word1 and word2 may be the same and they represent two individual words in
 * the list.
 * 
 * For example, Assume that words = ["practice", "makes", "perfect", "coding",
 * "makes"].
 * 
 * Given word1 = “makes”, word2 = “coding”, return 1. Given word1 = "makes",
 * word2 = "makes", return 3.
 * 
 * Note: You may assume word1 and word2 are both in the list.
 * 
 * Hide Company Tags LinkedIn Hide Tags Array Hide Similar Problems (E) Shortest
 * Word Distance (M) Shortest Word Distance II
 * 
 */

public class _245_ShortestWordDistanceIII {

	public int shortestWordDistance(String[] words, String word1, String word2) {
		int res = Integer.MAX_VALUE;
		int index1 = -2;
		int index2 = -1;
		if (word1.equals(word2)) {
			
			for (int i = 0; i < words.length; i++) {
				if (word1.equals(words[i]) && index1 < index2) {
					index1 = i;
					if (index2 >= 0) {
						res = Math.min(res, Math.abs(index1 - index2));
					}
				}
				else if (word1.equals(words[i]) && index2 < index1) {
					index2 = i;
					if (index1 >= 0) {
						res = Math.min(res, Math.abs(index1 - index2));
					}
				}
			}
		} else {

			for (int i = 0; i < words.length; i++) {
				if (word1.equals(words[i])) {
					index1 = i;
					if (index2 >= 0) {
						res = Math.min(res, Math.abs(index1 - index2));
					}
				} else if (word2.equals(words[i])) {
					index2 = i;
					if (index1 >= 0) {
						res = Math.min(res, Math.abs(index1 - index2));
					}
				}
			}
		}
		return res;

	}

	public int shortestWordDistance2(String[] words, String word1, String word2) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (word1.equals(words[i])) {
				list1.add(i);
			} else if (word2.equals(words[i])) {
				list2.add(i);
			}
		}
		int res = Integer.MAX_VALUE;
		if (word1.equals(word2)) {
			int i = 0;

			while (i < list1.size() - 1) {
				int index1 = list1.get(i);
				int index2 = list1.get(i + 1);
				res = Math.min(index2 - index1, res);
				i++;
			}
		} else {
			int i = 0, j = 0;
			while (i < list1.size() && j < list2.size()) {
				int index1 = list1.get(i);
				int index2 = list2.get(j);
				if (index1 < index2) {
					res = Math.min(res, index2 - index1);
					i++;
				} else {
					res = Math.min(res, index1 - index2);
					j++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String[] words = { "a", "a" };
		System.out.println(new _245_ShortestWordDistanceIII().shortestWordDistance(
				words, "a", "a"));
	}

}
