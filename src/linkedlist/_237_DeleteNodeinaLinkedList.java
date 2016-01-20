package linkedlist;

/**
 * 
 * @author founder
 *
 */
public class _237_DeleteNodeinaLinkedList {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
