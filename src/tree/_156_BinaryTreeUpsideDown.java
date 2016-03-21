package tree;

/**
 * 
 * @author founder
 * The transform of the base three-node case is like below:

                         Root                   L
                         /  \                  /  \
                        L    R                R   Root
You can image you grab the L to the top, then the Root becomes it's right node, and the R 
 */
public class _156_BinaryTreeUpsideDown {
	public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root == null || root.left == null){
            return root;
        }
        TreeNode newRoot = upsideDownBinaryTree(root.left);
        root.left.left = root.right;
        root.left.right = root;
        root.left = null;
        root.right = null;
        return newRoot;
        
    }

}
