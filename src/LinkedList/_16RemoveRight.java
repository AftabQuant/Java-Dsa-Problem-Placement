package LinkedList;

public class _16RemoveRight {
    public static ListNode removeGreater(ListNode head) {
        if(head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur!=null) {
            if(cur.val >= prev.val){
                prev = cur;
                temp.next = cur;
                cur = cur.next;
                temp = temp.next;
            }
            else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    static void print(ListNode head) {
        while(head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(8);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next=null;
        ListNode dummy = removeGreater(a);
        print(dummy);
    }
}
