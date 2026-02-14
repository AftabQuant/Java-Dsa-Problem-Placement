package LinkedList.LinkedListRev;

public class DelMidNode {
    public static Node deleteMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next.next!=null && fast.next.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        slow.next = slow.next.next;
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(1);
        Node f = new Node(2);
        Node g = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        display(a);

        Node mid =  deleteMiddle(a);
        display(mid);
    }
}
