package TreeDataStructure;

public class _1SumOfTreeNode {
    static int sumBT(Node root) {
        if(root==null) return 0;
        return root.val + sumBT(root.left) + sumBT(root.right);
    }
    static int productOfNonZeroElement(Node root) {
        if(root==null) return 1;
        if(root.val==0) return productOfNonZeroElement(root.left) * productOfNonZeroElement(root.right);
        return root.val * productOfNonZeroElement(root.left) * productOfNonZeroElement(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        System.out.println(sumBT(a));
        System.out.println(productOfNonZeroElement(a));
    }
}
