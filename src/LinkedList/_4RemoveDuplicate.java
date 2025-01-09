package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _4RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null) {
            if(slow.val==fast.val) fast = fast.next;
            else {
                slow.next = fast;
                slow = fast;
            }

        }
        slow.next = null;
        return head;
    }
    public static void main(String[] args) {

    }
}
