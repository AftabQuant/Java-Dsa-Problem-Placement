package LinkedList;

public class _6MergeTwoLL {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if(h1==null && h2==null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(h1!=null && h2!=null) {
            if(h1.val <= h2.val) {
                temp.next = h1;
                temp = h1;
                h1 = h1.next;
            }
            else{
                temp.next = h2;
                temp = h2;
                h2 = h2.next;
            }
        }
        while(h1!=null){
            temp.next = h1;
            temp = h1;
            h1 = h1.next;
        }
        while(h2!=null){
            temp.next = h2;
            temp = h2;
            h2 = h2.next;
        }
        dummy = dummy.next;
        return dummy;
    }

}
