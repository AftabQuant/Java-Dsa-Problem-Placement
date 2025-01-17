package LinkedList;

import java.util.ArrayList;

public class _12PalindromeLL {
    public boolean isPalindrome1(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        int i=0, j=arr.size()-1;
        while(i<=j) {
            if(arr.get(i)!=arr.get(j)) return false;
            i++; j--;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        ListNode n = head;
        while(c!=null) {
            n = n.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t1 = head;
        ListNode t2 = reverseList(slow.next);
        while(t1!=null && t2!=null) {
            if(t1.val != t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}
