package linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * heap´æ´¢
 * @author founder
 *
 */
public class _023_MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}

		Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.length,
				new Comparator<ListNode>() {
					@Override
					public int compare(ListNode o1, ListNode o2) {
						return o1.val - o2.val;
					}
				});
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				heap.add(lists[i]);
			}
		}

		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (!heap.isEmpty()) {
			ListNode head = heap.poll();
			tail.next = head;
			tail = head;
			if (head.next != null) {
				heap.add(head.next);
			}
		}
		return dummy.next;
	}

}
