package LinkedList;

public class _5RotateList {
    public int length(ListNode head) {
        int le = 0;
        while(head!=null) {
            le++;
            head = head.next;
        }
        return le;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n = length(head);
        k %=n;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=k; i++) {
            fast = fast.next;
        }
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        fast.next = head;
        head = temp;
        return head;
    }
}
