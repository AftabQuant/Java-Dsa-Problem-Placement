package TreeDataStructure;

public class _9LowestCommonAncestor {
    public boolean exists(TreeNode root, TreeNode p) {
        if(root==null) return false;
        if(root==p) return true;
        return exists(root.left, p) || exists(root.right,p);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean pLies = exists(root.left,p);
        boolean qLies = exists(root.left,q);
        if(!pLies && !qLies)  return lowestCommonAncestor(root.right,p,q);
        else if(pLies && qLies) return lowestCommonAncestor(root.left,p,q);
        else return root;
    }
    public static void main(String[] args) {
    }
}
