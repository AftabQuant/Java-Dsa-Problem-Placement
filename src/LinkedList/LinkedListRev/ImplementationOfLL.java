package LinkedList.LinkedListRev;

class Linkedlist{
    private Node head;
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
    void insertAt(int idx, int val){
        if(idx > size) return;
        Node temp = head;
        Node node = new Node(val);
        while(idx>1) {
            temp = temp.next;
            idx--;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void getElement(int idx){
        if(idx >= size) return;
        Node temp = head;
        while(idx>0){
            temp = temp.next;
            idx--;
        }
        System.out.println(temp.val);
    }
    void deleteAtFront(){
        if(size==0) return;
        head = head.next;
        size--;
    }
    void deleteAtEnd(){
        if(size==0) return;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    void deleteAt(int idx){
        if(idx >= size) return;
        Node temp = head;
        while(idx>1){
            temp = temp.next;
            idx--;
        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next = temp.next.next;
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
        list.display();
        list.insertAt(2,100);
        list.display();
        list.getElement(2);
        list.deleteAtFront();
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAt(2);
        list.display();
        System.out.println(list.tail.val);
    }
}
