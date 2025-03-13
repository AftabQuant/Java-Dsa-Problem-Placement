package LinkedList;

public class _13MaxTwinSumOfLL {
    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode a = head.next;
        ListNode newHead = reverse(a);
        a.next = head;
        head.next = null;
        return newHead;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t2 = reverse(slow.next);
        ListNode t1 = head;
        int max =Integer.MIN_VALUE;
        while(t1!=null) {
            int sum = t1.val + t2.val;
            max = Math.max(max,sum);
            t1 = t1.next;
            t2 = t2.next;
        }
        return max;
    }
}
