package TreeDataStructure;

public class _11SubTreeEqualToSum {
    public static int calculate_sum(Node root) {
        if(root==null) return 0;
        return root.val + calculate_sum(root.left) + calculate_sum(root.right);
    }
    public static boolean isEqualToSum(Node root, int sum) {
        if(root==null) return false;
        int subtreeSum = calculate_sum(root);
        if(subtreeSum == sum) return true;
        return isEqualToSum(root.left, sum) || isEqualToSum(root.right, sum);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(9);
        Node f = new Node(8);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        System.out.println(isEqualToSum(a, 17));
    }
}
