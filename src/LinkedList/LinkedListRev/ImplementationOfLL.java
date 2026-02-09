package LinkedList.LinkedListRev;

class Linkedlist{
    Node head;
    Node tail;
    private int size = 0;

    void insertAtEnd(int val) {
        Node node = new Node(val);
        if(head==null)  head = node;
        else    tail.next = node;
        tail = node;
        size++;
    }
    void insertAtFront(int val) {
        Node node = new Node(val);
        if(head==null) {
            insertAtEnd(val);
            return;
        }
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void size(){
        System.out.println("Size of LinkedList: "+size);
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class ImplementationOfLL {
    static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.size();
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.display();
    }
}
