package TreeDataStructure.Revision_1;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

public class Basic {
    public static void print(Node root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }
    public static int sumOfTree(Node root) {
        if(root==null) return 0;
        return root.val + sumOfTree(root.left) + sumOfTree(root.right);
    }
    public static int productOfTree(Node root) {
        if(root==null) return 1;
        return root.val * productOfTree(root.left) * productOfTree(root.right);
    }
    public static int productNonZero(Node root) {
        if(root==null || root.val==0) return 1;
        return root.val * productNonZero(root.left) * productNonZero(root.right);
    }
    public static int maxValue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
    }
    public static int sizeOfTree(Node root){
        if(root==null) return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }
    public static int levelOfTree(Node root){
        if(root==null) return 0;
        return 1 + Math.max(levelOfTree(root.left), levelOfTree(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(0);
        a.left = b; a.right = c;
        b.left = d; b.right = e;

        print(a);
        System.out.println();
        System.out.println(sumOfTree(a));
        System.out.println(productOfTree(a));
        System.out.println(productNonZero(a));
        System.out.println(maxValue(a));
        System.out.println(sizeOfTree(a));
        System.out.println(levelOfTree(a));
    }
}
