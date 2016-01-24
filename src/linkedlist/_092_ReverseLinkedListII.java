package linkedlist;

public class _092_ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;

		for (int i = 0; i < m - 1; i++) {
			head = head.next;
		}

		ListNode start = head.next;

		for (int i = m; i < n; i++) {
			ListNode aft = start.next;
			start.next = aft.next;
			aft.next = head.next;
			head.next = aft;
		}

		return dummy.next;

	}

}
