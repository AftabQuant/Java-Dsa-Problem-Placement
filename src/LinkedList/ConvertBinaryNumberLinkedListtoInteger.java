package LinkedList;

public class ConvertBinaryNumberLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int len = -1;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        int sum = 0;
        while(head!=null) {
            int value = head.val;
            sum += (value) * (int) Math.pow(2, len);
            len--;
        }
        return sum;
    }
}
