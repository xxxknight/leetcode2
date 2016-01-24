package linkedlist;

/**
 * 
 * @author founder
 * 
 */
public class _019_RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode slow = dummy;
		ListNode fast = slow;

		while (slow != null) {
			int cnt = 0;
			while (cnt <= n) {
				fast = fast.next;
				cnt++;
			}
			if (fast == null) {
				slow.next = slow.next.next;
				break;
			} else {
				slow = slow.next;
				fast = slow;
			}

		}
		return dummy.next;
	}
}
