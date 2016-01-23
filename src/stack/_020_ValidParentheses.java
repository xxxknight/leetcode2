package stack;

import java.util.Stack;

public class _020_ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() == 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		char[] strs = s.toCharArray();
		for (int i = 0; i < strs.length; i++) {
			if (stack.isEmpty()) {
				stack.push(strs[i]);
				continue;
			}
			if ((stack.peek() == '(' && strs[i] == ')')
					|| (stack.peek() == '[' && strs[i] == ']')
					|| (stack.peek() == '{' && strs[i] == '}')) {
				stack.pop();
			} else {
				stack.push(strs[i]);
			}
		}
		return stack.isEmpty();
	}

}
