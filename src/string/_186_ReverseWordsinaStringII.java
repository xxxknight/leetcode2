package string;

/**
 * Given an input string, reverse the string word by word. A word is defined as
 * a sequence of non-space characters.
 * 
 * The input string does not contain leading or trailing spaces and the words
 * are always separated by a single space.
 * 
 * For example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * Could you do it in-place without allocating extra space?
 * 
 * Related problem: Rotate Array
 * 
 * Hide Company Tags Amazon Microsoft Hide Tags String Hide Similar Problems (M)
 * Reverse Words in a String (E) Rotate Array
 * 
 * 
 */
public class _186_ReverseWordsinaStringII {
	public void reverseWords(char[] s) {
		if (null == s || s.length <= 1) {
			return;
		}
		int begin = 0;
		int end = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ') {
				end = i - 1;
				reverseWord(s, begin, end);
				begin = i + 1;
			}
		}
		reverseWord(s, begin, s.length - 1);
		reverseWord(s, 0, s.length - 1);
	}

	public void reverseWord(char[] s, int begin, int end) {
		while (begin < end) {
			char temp = s[begin];
			s[begin] = s[end];
			s[end] = temp;
			begin++;
			end--;
		}

	}

	public static void main(String[] args) {
		String s = "the sky is blue";
		new _186_ReverseWordsinaStringII().reverseWords(s.toCharArray());

	}

}
