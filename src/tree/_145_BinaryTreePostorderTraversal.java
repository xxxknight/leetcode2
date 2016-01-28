package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				res.add(0, root.val);
				stack.add(root);
				root = root.right;
			} else {
				root = stack.pop();
				root = root.left;
			}
		}

		return res;
	}

}
