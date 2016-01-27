package tree;

public class _111_MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null) {
			return minDepth(root.right) + 1;	//左子树为空，则高度为右子树加一
		}
		if (root.right == null) {
			return minDepth(root.left) + 1;		//右子树为空，则高度为左子树加一
		}
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}
