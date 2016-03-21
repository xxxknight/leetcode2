package tree;


/**
 * Given an array of numbers, verify whether it is the correct preorder
 * traversal sequence of a binary search tree.
 * 
 * You may assume each number in the sequence is unique.
 * 
 * Follow up: Could you do it using only constant space complexity?
 * 
 * Hide Company Tags Zenefits Hide Tags Tree Stack Hide Similar Problems (M)
 * Binary Tree Preorder Traversal
 * 
 * @author founder
 * 
 */

public class _255_VerifyPreorderSequenceinBinarySearchTree {
	public boolean verifyPreorder(int[] preorder) {
		if (preorder == null || preorder.length <= 1) {
			return true;
		}
		return helper(preorder, 0, preorder.length - 1);

	}

	public boolean helper(int[] arr, int first, int end) {
		if (arr == null || end - first < 1) {
			return true;
		}
		int root = arr[first];
		int index = first + 1;
		while (index <= end && arr[index] < root) {
			index++;
		}
		int tmp = index;
		while (index <= end) {
			if (arr[index] < root) {
				return false;
			}
			index++;
		}
		boolean left = helper(arr, first + 1, tmp - 1);
		boolean right = helper(arr, tmp, end);
		return left && right;
	}
	
	public static void main(String[] args) {
		System.out.println(new _255_VerifyPreorderSequenceinBinarySearchTree ().verifyPreorder(new int[]{4,2,3,1}));
	}

}
