package linkedlist;

public class _061_RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (k == 0 || head == null) {
			return head;
		}

		ListNode last = head;
		ListNode temp = head;

		int cnt = 1;
		while (last.next != null) {
			last = last.next;
			cnt++;
		}

		k = k % cnt;
		if (k == 0) {
			return head;
		}

		for (int i = 0; i < cnt - k; i++) {
			head = head.next;
			last.next = temp;
			temp.next = null;
			last = temp;
			temp = head;
		}

		return head;

	}

}
