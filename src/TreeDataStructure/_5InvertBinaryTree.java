package TreeDataStructure;

public class _5InvertBinaryTree {
    public void swap(Node root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        swap(root.left);
        swap(root.right);
    }
    public Node invertTree(Node root) {
        swap(root);
        return root;
    }
    public static void main(String[] args) {

    }
}
