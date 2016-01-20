package linkedlist;

public class _143_ReorderList {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode second = slow.next;
		slow.next = null;
		ListNode ReverseSecond = reverseList(second);
		merge(head, ReverseSecond);
	}

	private ListNode reverseList(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = pre;
			pre = head;
			head = temp;
		}
		return pre;

	}

	private void merge(ListNode head1, ListNode head2) {
		int index = 0;
		ListNode dummy = new ListNode(0);
		while (head1 != null && head2 != null) {
			if (index % 2 == 0) {
				dummy.next = head1;
				head1 = head1.next;
			} else {
				dummy.next = head2;
				head2 = head2.next;
			}
			dummy = dummy.next;
			index++;
		}
		if (head1 != null) {
			dummy.next = head1;
		} else {
			dummy.next = head2;
		}
	}

}
