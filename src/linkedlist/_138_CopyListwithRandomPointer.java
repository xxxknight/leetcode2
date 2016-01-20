package linkedlist;

import java.util.HashMap;

public class _138_CopyListwithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

		RandomListNode temp = head;
		while (temp != null) {
			map.put(temp, new RandomListNode(temp.label));
			temp = temp.next;
		}

		RandomListNode temp2 = head;
		while (temp2 != null) {
			map.get(temp2).next = map.get(temp2.next);
			map.get(temp2).random = map.get(temp2.random);
			temp2 = temp2.next;
		}

		return map.get(head);

	}

}
