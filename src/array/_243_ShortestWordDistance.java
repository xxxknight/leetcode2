package array;

/**
 * Given a list of words and two words word1 and word2, return the shortest
 * distance between these two words in the list.
 * 
 * For example, Assume that words = ["practice", "makes", "perfect", "coding",
 * "makes"].
 * 
 * Given word1 = “coding”, word2 = “practice”, return 3. Given word1 = "makes",
 * word2 = "coding", return 1.
 * 
 * Note: You may assume that word1 does not equal to word2, and word1 and word2
 * are both in the list.
 * 
 * tag: lock easy
 * 
 */

public class _243_ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
		if (null == words || words.length <= 1 || word1 == null
				|| word2 == null) {
			return 0;
		}
		int res = Integer.MAX_VALUE;
		int index1 = -1;
		int index2 = -1;

		for (int i = 0; i < words.length; i++) {
			if (word1.equals(words[i])) {
				index1 = i;
				if (index2 != -1) {
					res = Math.min(res,i - index2);
				}
			} else if (word2.equals(words[i])) {
				index2 = i;
				if (index1 != -1) {
					res = Math.min(res, i - index1);
				}
			}
		}
		return res;

	}

	public static void main(String[] args) {
		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
		System.out.println(new _243_ShortestWordDistance().shortestDistance(words, "makes", "coding"));
		

	}

}
