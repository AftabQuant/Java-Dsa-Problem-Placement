package LinkedList;

public class _6MergeTwoLL {
    public static ListNode mergeTwoLists(ListNode h1, ListNode h2) {
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
    public static ListNode mergeLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        else if(l2==null) return l1;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = l1; ListNode t2 = l2;
        while(l1!=null && l2!=null) {
            if(l1.val<=l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        while(l1!=null){
            temp.next = l1;
            temp = l1;
            l1 = l1.next;

        }
        while(l2!=null)
        {
            temp.next = l2;
            temp = l2;
            l2 = l2.next;
        }
        return dummy.next;
    }
    public static ListNode create_ll(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i=1; i<arr.length; i++) {
            ListNode ln = new ListNode(arr[i]);
            temp.next = ln;
            temp = ln;
        }
        return head;
    }
    public static void print(ListNode head) {
        while(head!=null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] t1 = {1,2,4};
        int[] t2 = {1,3,4};
        ListNode l1 = create_ll(t1);
        ListNode l2 = create_ll(t2);
        ListNode f = mergeLists(l1, l2);
        print(f);
    }
}
