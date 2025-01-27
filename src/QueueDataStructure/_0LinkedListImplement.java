package QueueDataStructure;

class Node {
    int val;
    Node next;
    Node(int val) {this.val = val;}
}
class queuee {
    Node f = null; // tail
    Node r = null; // head
    int size = 0;
    void add(int x) {
        Node temp = new Node(x);
        if(r==null) r = temp;
        else f.next = temp;
        f = temp;
    }
    int remove() {
        if(r==null) return -1;
        int top = r.val;
        r = r.next;
        return top;
    }
    int peek() {
        if(r==null) return -1;
        return r.val;
    }
    void print() {
        Node t = r;
        while(t!=null) {
            System.out.print(t.val+" ");
            t = t.next;
        }
        System.out.println();

    }
}
public class _0LinkedListImplement {
    public static void main(String[] args) {
        queuee q = new queuee();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        System.out.println(q.remove());
        q.print();
        System.out.println(q.peek());
//        System.out.println(q.size());
    }
}
