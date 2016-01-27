package tree;

public class _110_BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		return (Math.abs(leftHeight - rightHeight) <= 1)
				&& isBalanced(root.left) && isBalanced(root.right);
	}

	private int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

}
