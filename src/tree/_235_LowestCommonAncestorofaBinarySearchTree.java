package tree;

/**
 * 
 * @author founder
 * 
 */
public class _235_LowestCommonAncestorofaBinarySearchTree {

	// recursion version
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else {
			return root;
		}
	}

	// non-recursion version
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		while (true) {
			if (root.val > p.val && root.val > q.val) {
				root = root.left;
			} else if (root.val < p.val && root.val < q.val) {
				root = root.right;
			} else {
				return root;
			}
		}
	}

}
