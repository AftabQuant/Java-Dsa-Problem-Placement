package LinkedList;

public class _10OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode dummy2 = new ListNode(-1);
        ListNode temp2 = dummy2; int c = 1;
        while(head!=null) {
            if(c%2!=0) {
                temp1.next = head;
                temp1 = temp1.next;
            }
            else {
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
            c++;
        }
        temp2.next = null;
        temp1.next = dummy2.next;
        return dummy1.next;
    }
}
