package linkedlist;

public class _234_PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return true;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode head2 = fast == null ? reverse(slow) : reverse(slow.next);
		while (head2 != null) {
			if (head2.val != head.val)
				return false;
			head = head.next;
			head2 = head2.next;
		}
		return true;
	}

	// ·­×ªÁ´±í
	public ListNode reverse(ListNode head) {
		ListNode prev = new ListNode(0);
		while (head != null) {
			ListNode temp = head.next;
			head.next = prev.next;
			prev.next = head;
			head = temp;
		}
		return prev.next;
	}

}
