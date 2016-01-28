package tree;

public class _111_MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null) {
			return minDepth(root.right) + 1;	//������Ϊ�գ���߶�Ϊ��������һ
		}
		if (root.right == null) {
			return minDepth(root.left) + 1;		//������Ϊ�գ���߶�Ϊ��������һ
		}
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}
