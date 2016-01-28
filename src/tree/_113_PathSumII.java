package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _113_PathSumII {
	//recursion version,more efficient
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		List<Integer> cur = new ArrayList<Integer>();
		pathSum(root, sum, cur, ret);
		return ret;
	}

	private void pathSum(TreeNode root, int sum, List<Integer> cur,
			List<List<Integer>> ret) {
		if (root == null) {
			return;
		}
		cur.add(root.val);
		if (root.left == null && root.right == null && root.val == sum) {
			ret.add(new ArrayList<Integer>(cur));
		} else {
			pathSum(root.left, sum - root.val, cur, ret);
			pathSum(root.right, sum - root.val, cur, ret);
		}
		cur.remove(cur.size() - 1);
	}

	// non-recursion version using stack
	public List<List<Integer>> pathSum2(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Stack<Wrapper> stack = new Stack<>();
		List<Integer> tmp = new ArrayList<>();
		tmp.add(root.val);
		stack.add(new Wrapper(root, tmp));
		while (!stack.isEmpty()) {
			Wrapper cur = stack.pop();
			if (cur.node.left == null && cur.node.right == null
					&& cur.node.val == sum) {
				res.add(cur.path);
			}
			if (cur.node.left != null) {

				tmp = new ArrayList<>();
				tmp.addAll(cur.path);
				tmp.add(cur.node.left.val);
				cur.node.left.val += cur.node.val;
				stack.add(new Wrapper(cur.node.left, tmp));
			}
			if (cur.node.right != null) {
				tmp = new ArrayList<>();
				tmp.addAll(cur.path);
				tmp.add(cur.node.right.val);
				cur.node.right.val += cur.node.val;
				stack.add(new Wrapper(cur.node.right, tmp));
			}
		}
		return res;

	}

	private class Wrapper {
		private TreeNode node;
		private List<Integer> path;

		public Wrapper(TreeNode node, List<Integer> path) {
			this.node = node;
			this.path = path;
		}
	}
}
