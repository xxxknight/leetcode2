package linkedlist;

import java.util.Stack;

public class _025_ReverseNodesinkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		int len = 0;
		ListNode tmp = head;
		while (tmp != null) {
			len++;
			tmp = tmp.next;
		}

		ListNode dummy = new ListNode(0);
		Stack<ListNode> stack = new Stack<>(); // 利用栈来反转部分链表，也可以利用假头结点

		ListNode left = dummy;
		ListNode right = left.next;
		int partLen = len / k;
		for (int i = 0; i < partLen; i++) {
			for (int j = 0; j < k; j++) {
				stack.push(right);
				right = right.next;
			}

			for (int j = 0; j < k; j++) {
				left.next = stack.pop();
				left = left.next;
			}
			left.next = right;
		}
		return dummy.next;
	}
}
