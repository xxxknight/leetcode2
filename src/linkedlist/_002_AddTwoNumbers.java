package linkedlist;

public class _002_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int flag = 0;
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		while (l1 != null && l2 != null) {

			int sum = l1.val + l2.val + flag;
			int val = sum % 10;
			ListNode node = new ListNode(val);
			head.next = node;
			head = head.next;
			flag = sum / 10;

			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int sum = l1.val + flag;
			int val = sum % 10;
			ListNode node = new ListNode(val);
			head.next = node;
			head = head.next;
			flag = sum / 10;

			l1 = l1.next;
		}

		while (l2 != null) {
			int sum = l2.val + flag;
			int val = sum % 10;
			ListNode node = new ListNode(val);
			head.next = node;
			head = head.next;
			flag = sum / 10;

			l2 = l2.next;
		}

		if (flag == 1) {
			ListNode node = new ListNode(1);
			head.next = node;
		}

		return dummy.next;

	}
}
