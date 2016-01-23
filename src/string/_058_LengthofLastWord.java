package string;

public class _058_LengthofLastWord {
	public int lengthOfLastWord(String s) {
		s = s.trim();
		int lastIndex = s.lastIndexOf(' ') + 1;
		return s.length() - lastIndex;
	}
}
