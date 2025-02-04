package TreeDataStructure;

public class _3FindSizeOfTree {
    public static int findSize(Node root) {
        if(root==null) return 0;
        return 1+ findSize(root.left) + findSize(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(40);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        System.out.println(findSize(a));
        System.out.println(findSize(a)-1);
    }
}
