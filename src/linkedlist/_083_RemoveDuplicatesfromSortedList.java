package linkedlist;

public class _083_RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode temp = head;
		while (temp != null && temp.next != null) {
			if (temp.next.val == temp.val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}

		}
		return head;
	}

}
