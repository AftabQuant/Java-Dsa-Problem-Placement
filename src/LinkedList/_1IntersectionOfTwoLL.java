package LinkedList;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {this.val = val;}
}

public class _1IntersectionOfTwoLL {
    public int length(ListNode head) {
        int size = 0;
        while(head!=null) {
            size++;
            head = head.next;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = length(headA);
        int lb = length(headB);
        int dif = Math.abs(la-lb);
        if(la>lb) for(int i=0; i<dif; i++) headA = headA.next;
        else if(la<lb) for(int i=0; i<dif; i++) headB = headB.next;
        while(headA!=headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
