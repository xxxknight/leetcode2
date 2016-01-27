package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * DFS基础模型。重要利用Stack，非递归形式
 * @author founder
 *
 */

public class _144_BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				res.add(root.val);
				stack.add(root);
				root = root.left;
			} else {
				root = stack.pop();
				root = root.right;
			}
		}
		return res;

	}

}
