package linkedlist;

/**
 * 
 * @author founder
 * 
 */
public class _142_LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				while (head != slow) {
					slow = slow.next;
					head = head.next;
				}
				return slow;
			}
		}
		return null;
	}

}
