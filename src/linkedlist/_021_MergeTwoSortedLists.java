package linkedlist;

public class _021_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode key = head;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				key.next = l1;
				l1 = l1.next;
			} else {
				key.next = l2;
				l2 = l2.next;
			}

			key = key.next;
		}
		while (l1 != null) {
			key.next = l1;
			l1 = l1.next;
			key = key.next;
		}

		while (l2 != null) {
			key.next = l2;
			l2 = l2.next;
			key = key.next;
		}
		return head.next;
	}

}
