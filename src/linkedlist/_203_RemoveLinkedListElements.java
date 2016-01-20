package linkedlist;

/**
 * 
 * @author founder
 * 
 */
public class _203_RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode newHead = dummy;

		while (dummy.next != null) {
			if (dummy.next.val == val) {
				dummy.next = dummy.next.next;
			} else {
				dummy = dummy.next;
			}
		}
		return newHead.next;
	}
}
