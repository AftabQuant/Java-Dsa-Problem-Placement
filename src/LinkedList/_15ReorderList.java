package LinkedList;

public class _15ReorderList {
    public void reverse(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode a = head.next;
        reverse(a);
        a.next = head;
        head.next = null;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t2 = slow.next;
        slow.next = null;
        reverse(t2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head!=null && t2 != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
        if(head==null) temp.next = t2;
        if(t2==null) temp.next = head;
        head = dummy.next;
    }
}
