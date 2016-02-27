package tree;

/**
 * Given a non-empty binary search tree and a target value, find the value in
 * the BST that is closest to the target.
 * 
 * Note: Given target value is a floating point. You are guaranteed to have only
 * one unique value in the BST that is closest to the target.
 * 
 * tag:easy lock
 * 
 */

// 结果节点一定在查找路径上
public class _270_ClosestBinarySearchTreeValue {
	public int closestValue(TreeNode root, double target) {

		int res = root.val;
		double min = Math.abs(target - root.val);

		while (root != null) {
			if (root.val == target) {
				return root.val;
			} else if (root.val > target) {
				root = root.left;
			} else {
				root = root.right;
			}

			if (root != null && Math.abs(target - root.val) < min) {
				min = Math.abs(target - root.val);
				res = root.val;
			}
		}
		return res;
	}
}
