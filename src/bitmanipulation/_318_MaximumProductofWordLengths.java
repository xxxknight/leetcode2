package bitmanipulation;

import java.util.Arrays;
import java.util.Comparator;

public class _318_MaximumProductofWordLengths {

	public int maxProduct(String[] words) {
		int max = 0;

		Arrays.sort(words, new Comparator<String>() {
			public int compare(String a, String b) {
				return b.length() - a.length();
			}
		});

		int[] masks = new int[words.length]; // alphabet masks

		for (int i = 0; i < masks.length; i++) {
			for (char c : words[i].toCharArray()) {
				masks[i] |= 1 << (c - 'a');
			}
		}

		for (int i = 0; i < masks.length; i++) {
			for (int j = i + 1; j < masks.length; j++) {
				if ((masks[i] & masks[j]) == 0) {
					max = Math.max(max, words[i].length() * words[j].length());
					break; // prunning,因为从大到小排序，所以可以提前Break
				}
			}
		}
		return max;
	}

}
