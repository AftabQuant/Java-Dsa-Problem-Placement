package LinkedList;

public class _2LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean flag;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
