package LinkedList;
import java.util.*;

public class _8MergeKSortedList {
    public ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(a!=null && b!=null) {
            if(a.val <=b.val) {
                temp.next = a;
                a = a.next;
            }
            else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        if(a!=null) temp.next = a;
        else temp.next = b;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> arr = new ArrayList<>();
        for(int i=0; i<lists.length; i++) arr.add(lists[i]);
        while(arr.size()!=1) {
            ListNode a = arr.removeLast();
            ListNode b = arr.removeLast();
            ListNode c = merge(a,b);
            arr.add(c);
        }
        ListNode head = arr.get(0);
        return head;
    }
}
