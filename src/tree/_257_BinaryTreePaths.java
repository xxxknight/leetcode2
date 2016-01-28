package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _257_BinaryTreePaths {
	// recursion-version
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		helper(root, res, "");
		return res;

	}

	// ¸¨Öúº¯Êý
	private void helper(TreeNode root, List<String> list, String path) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			list.add(path + root.val);
		}
		if (root.left != null) {
			helper(root.left, list, path + root.val + "->");
		}
		if (root.right != null) {
			helper(root.right, list, path + root.val + "->");
		}
	}

	private class Wrapper {
		private TreeNode node;
		private String path;

		public Wrapper(TreeNode node, String path) {
			this.node = node;
			this.path = path;
		}
	}

	// non-recursion-version
	public List<String> binaryTreePaths2(TreeNode root) {
		List<String> res = new LinkedList<>();
		if (root == null) {
			return res;
		}
		Stack<Wrapper> stack = new Stack<>();
		stack.add(new Wrapper(root, ""+root.val));
		while(!stack.isEmpty()){
			Wrapper wrapper = stack.pop();
			if (wrapper.node.left == null && wrapper.node.right == null) {
				res.add(wrapper.path);
			}
			if (wrapper.node.left != null) {
				stack.add(new Wrapper(wrapper.node.left, wrapper.path + "->" + wrapper.node.left.val));
			}
			if (wrapper.node.right != null) {
				stack.add(new Wrapper(wrapper.node.right, wrapper.path + "->" + wrapper.node.right.val));
			}
		}
		return res;

	}

}
