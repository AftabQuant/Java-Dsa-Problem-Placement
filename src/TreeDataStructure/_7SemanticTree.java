package TreeDataStructure;

public class _7SemanticTree {
    public TreeNode invert(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public boolean isSame(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(!isSame(p.left,q.left)) return false;
        return isSame(p.right,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = invert(root.left);
        TreeNode right = root.right;
        return isSame(left, right);
    }
}
