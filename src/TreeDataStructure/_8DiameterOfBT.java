package TreeDataStructure;

import com.sun.source.tree.Tree;

public class _8DiameterOfBT {
    public int level(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(level(root.left), level((root.right)));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int total = level(root.left) + level(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(total, Math.max(left, right));
    }
}
