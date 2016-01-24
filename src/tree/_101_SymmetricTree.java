package tree;

//DFS
public class _101_SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return root == null ? true : helper(root.left, root.right);
	}

	public boolean helper(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left != null && right != null) {
			return left.val == right.val && helper(left.left, right.right)
					&& helper(right.left, left.right);
		}
		return false;
	}

}
