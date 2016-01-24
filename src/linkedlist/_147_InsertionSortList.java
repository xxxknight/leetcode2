package linkedlist;

public class _147_InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		ListNode dummy = new ListNode(0);
		ListNode tmp1 = head;
		ListNode tmp2 = dummy;

		while (tmp1 != null) {
			while (tmp2.next != null && tmp2.next.val < tmp1.val) {
				tmp2 = tmp2.next;
			}
			head = tmp1.next;
			tmp1.next = tmp2.next;
			tmp2.next = tmp1;

			tmp1 = head;
			tmp2 = dummy;
		}

		return dummy.next;
	}

}
