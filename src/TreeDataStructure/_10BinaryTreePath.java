package TreeDataStructure;
import java.util.*;

public class _10BinaryTreePath {
    public void helper(TreeNode root, String st, List<String> res) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            st +=root.val;
            res.add(st);
            return;
        }
        helper(root.left, st+root.val+"->", res);
        helper(root.right, st+root.val+"->", res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(root,"",res);
        return res;
    }

    public static void main(String[] args) {
    }
}
