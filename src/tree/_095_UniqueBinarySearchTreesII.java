package tree;

import java.util.ArrayList;
import java.util.List;

public class _095_UniqueBinarySearchTreesII {

	// DFS method
	public List<TreeNode> generateTrees(int n) {
		if (n == 0) {
			return new ArrayList<TreeNode>();
		}
		return generateTrees(1, n);
	}

	private List<TreeNode> generateTrees(int b, int e) {
		List<TreeNode> res = new ArrayList<>();
		if (b > e) {
			res.add(null);
		} else if (b == e) {
			res.add(new TreeNode(b));
		} else {
			for (int i = b; i <= e; i++) {
				List<TreeNode> left = generateTrees(b, i - 1);
				List<TreeNode> right = generateTrees(i + 1, e);
				int lsize = left.size();
				int rsize = right.size();
				for (int j = 0; j < lsize; j++) {
					for (int k = 0; k < rsize; k++) {
						TreeNode root = new TreeNode(i);
						root.left = left.get(j);
						root.right = right.get(k);
						res.add(root);
					}
				}
			}
		}
		return res;
	}
	
	public static List<TreeNode> generateTrees2(int n) {
        List<TreeNode>[] result = new ArrayList[n+1];
        result[0] = new ArrayList<TreeNode>();
        result[0].add(null);

        for(int len = 1; len <= n; len++){
            result[len] = new ArrayList<TreeNode>();
            for(int j=0; j<len; j++){
                for(TreeNode nodeL : result[j]){
                    for(TreeNode nodeR : result[len-j-1]){
                        TreeNode node = new TreeNode(j+1);
                        node.left = nodeL;
                        node.right = clone(nodeR, j+1);
                        result[len].add(node);
                    }
                }
            }
        }
        return result[n];
    }

    private static TreeNode clone(TreeNode n, int offset){
        if(n == null)
            return null;
        TreeNode node = new TreeNode(n.val + offset);
        node.left = clone(n.left, offset);
        node.right = clone(n.right, offset);
        return node;
    }

}
