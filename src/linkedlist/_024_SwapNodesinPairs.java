package linkedlist;

public class _024_SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode cur = dummy;
		while (cur.next != null && cur.next.next != null) {
			ListNode fir = cur.next;
			ListNode sec = cur.next.next;

			fir.next = sec.next;
			sec.next = fir;
			cur.next = sec;
			cur = fir;
		}
		return dummy.next;
	}

}
