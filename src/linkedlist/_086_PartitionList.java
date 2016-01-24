package linkedlist;

public class _086_PartitionList {
	public ListNode partition(ListNode head, int x) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode preNode = new ListNode(0);
		ListNode aftNode = new ListNode(0);
		ListNode point = head;
		ListNode pre = preNode;
		ListNode aft = aftNode;
		while (point != null) {
			ListNode temp = point.next;
			if (point.val < x) {
				pre.next = point;
				pre = pre.next;
				pre.next = null;
			} else {
				aft.next = point;
				aft = aft.next;
				aft.next = null;
			}
			point = temp;
		}
		pre.next = aftNode.next;
		return preNode.next;
	}

}
