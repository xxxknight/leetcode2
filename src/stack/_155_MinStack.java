package stack;

import java.util.Stack;

/**
 * ��������stack��һ��������ջ������һ���洢��Сֵ
 * @author founder
 *
 */
public class _155_MinStack {
	private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
        if(min.isEmpty() || x <= min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        if(stack.peek().equals(min.peek())){
            min.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(min.isEmpty()){
            return -1;
        }
        return min.peek();
    }

}
