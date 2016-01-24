package linkedlist;

public class _328_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null)
			return head;
		ListNode oddTmp = head;
		ListNode evenHead = head.next;
		ListNode evenTmp = evenHead;

		while (evenTmp != null && evenTmp.next != null) {
			oddTmp.next = evenTmp.next;
			oddTmp = oddTmp.next;
			evenTmp.next = oddTmp.next;
			evenTmp = evenTmp.next;
		}
		oddTmp.next = evenHead;
		return head;
	}

}
