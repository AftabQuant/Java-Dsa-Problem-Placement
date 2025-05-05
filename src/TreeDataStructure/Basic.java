package TreeDataStructure;

public class Basic {
    public static void preOrder(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static int maxDepth(Node root) {
        if(root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static boolean isSameTree(Node a, Node b) {
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val != b.val) return false;
        else if(isSameTree(a.left, b.left)) return true;
        else if(isSameTree(a.right, b.right)) return true;
        return false;
    }
    public static int totalSum(Node root) {
        if(root==null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();
        System.out.println(maxDepth(a));
        System.out.println(isSameTree(a, a));
        System.out.println(totalSum(a));
    }
}
