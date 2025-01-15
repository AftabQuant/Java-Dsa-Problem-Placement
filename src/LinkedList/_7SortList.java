package LinkedList;

import java.util.List;

public class _7SortList {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode h1 = l1;
        ListNode h2 = l2;
        while(h1!=null && h2!=null) {
            if(h1.val <= h2.val) {
                temp.next = h1;
                h1 = h1.next;
            }
            else{
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        if(h1!=null) temp.next = h1;
        else temp.next = h2;
        return dummy;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        ListNode ans = merge(firstHalf, secondHalf);
        return ans;
    }
}
