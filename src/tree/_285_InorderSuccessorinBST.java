package tree;

import java.util.Stack;

/**
 * Given a binary search tree and a node in it, find the in-order successor of
 * that node in the BST.
 * 
 * Note: If the given node has no in-order successor in the tree, return null.
 * 
 * Hide Company Tags Microsoft Hide Tags Tree Hide Similar Problems (M) Binary
 * Tree Inorder Traversal (M) Binary Search Tree Iterator
 * 
 * 
 */

public class _285_InorderSuccessorinBST {
	
	//寻找下一个节点，根据中序遍历和二叉搜索树的特点即下一个比该数大的点
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		if (root == null || p == null) {
			return null;
		}
	    TreeNode res = null;
		while(root != null){
			if (root.val > p.val) {
				res = root;
				root = root.left;
			}else{
				root = root.right;
			}
		}
		return res;
		

	}

	// 这种方法不仅仅适用于二叉搜索树，通用所以效率低，可以通过。应该利用二叉搜索树值的特点解决
	public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
		if (root == null || p == null) {
			return null;
		}
		TreeNode res = null;
		Stack<TreeNode> stack = new Stack<>();
		boolean flag = true;
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				if (flag) {
					if (p.val == root.val) {
						flag = false;
					}
				} else {
					res = root;
					break;
				}
				root = root.right;

			}
		}
		return res;

	}

}
