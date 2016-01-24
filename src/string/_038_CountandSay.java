package string;

public class _038_CountandSay {
	public String countAndSay(int n) {
		if (n <= 0) {
			return "";
		}
		if (n == 1) {
			return "1";
		}
		StringBuilder sb = new StringBuilder();
		String temp = "1";
		for (int i = 2; i <= n; i++) {
			char c = temp.charAt(0);
			int cnt = 0;
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == c) {
					cnt++;
				} else {
					sb.append(cnt).append(c);
					c = temp.charAt(j);
					cnt = 1;
				}
			}
			sb.append(cnt).append(c);
			temp = sb.toString();
			sb.delete(0, sb.length());
		}
		return temp;
	}

}
