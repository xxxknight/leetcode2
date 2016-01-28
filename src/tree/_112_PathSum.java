package tree;

import java.util.Stack;

public class _112_PathSum {
	//recursion-version more efficient
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null && root.val == sum) {
			return true;
		}
		return hasPathSum(root.right, sum - root.val)
				|| hasPathSum(root.left, sum - root.val);

	}

	// non-recursion using stack
	public boolean hasPathSum2(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode tmp = stack.pop();
			if (tmp.left == null && tmp.right == null) {
				if (tmp.val == sum) {
					return true;
				}
			}
			if (tmp.left != null) {
				tmp.left.val += tmp.val;
				stack.add(tmp.left);
			}
			if (tmp.right != null) {
				tmp.right.val += tmp.val;
				stack.add(tmp.right);
			}
		}

		return false;
	}

}
