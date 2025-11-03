import java.util.*;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class LeetcodeProblems {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; int j=n-1; int k = m+n-1;
        while(i>=0 && j>=0) {
            if(nums1[i]>=nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
        while(i>=0) nums1[k--] = nums1[i--];
        while(j>=0) nums1[k--] = nums2[j--];
    }
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)) {
                res[0] = i;
                res[1] = map.get(rem);
            }
            else map.put(nums[i], i);
        }
        return res;
    }
    public static ListNode lastNode(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<k-1; i++) fast=fast.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode last = lastNode(head, k);
        ListNode fast = head;
        for(int i=0; i<k-1; i++) fast = fast.next;
        int temp = last.val;
        last.val = fast.val;
        fast.val = temp;
        return head;
    }
    public static ListNode odd_even_list(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddHead = odd;
        ListNode evenHead = even;
        while(head != null) {
            if(head.val%2 == 0) {
                evenHead.next = head;
                evenHead = head;
            }
            else {
                oddHead.next = head;
                oddHead = head;
            }
            head = head.next;
        }
        evenHead.next = null;
        oddHead.next = even.next;
        return odd.next;
    }
    public static void printList(ListNode head) {
        while(head!=null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static long solveProblem1(int n, String str) {
        long res = 0;
        for(int i=0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                long val1 = (long) str.charAt(i);
                long val2 = (long) str.charAt(j);
                if(val1 > 3 * val2) res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(2);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(4);
//        ListNode e = new ListNode(5);
//        a.next = b; b.next = c; c.next = d; d.next = e;
//
//        for(int i=1; i<=6; i++) {
//            for(int j=1; j<=i; j++) {
//                if(j==1 || i==j || i==6){
//                    System.out.print("*"+ " ");
//                }
//                else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }

        System.out.println(solveProblem1(5, "24310"));
    }
}
