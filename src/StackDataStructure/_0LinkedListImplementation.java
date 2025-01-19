package StackDataStructure;

class Node {
    int val;
    Node next;
    Node(int val) {this.val = val;}
}
class StackLL {
    int size = 0;
    Node head = null;
    void push(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop() {
        int top = head.val;
        head = head.next; size--;
        return top;
    }
    int peek() {
        return head.val;
    }
    int size() {
        return size;
    }
    void reverse(Node head) {
        if (head == null) return;
        reverse(head.next);
        System.out.print(head.val + " ");
    }
    void print() {
        reverse(head);
        System.out.println();
    }
}
public class _0LinkedListImplementation {
    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.print();
        System.out.println(st.pop());
        st.print();
        System.out.println(st.size());
        st.print();
        System.out.println(st.peek());
    }

}
