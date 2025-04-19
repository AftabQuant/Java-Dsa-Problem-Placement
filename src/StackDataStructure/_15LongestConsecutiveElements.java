package StackDataStructure;
import java.util.*;

public class _15LongestConsecutiveElements {
    public static int consecutiveElement(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {100,4,200, 1, 3, 2};
        for(int ele : arr) {
            set.add(ele);
        }
        int maxLength = 0;
        for(int ele : arr) {
            if(!set.contains(ele-1)) {
                int curr = ele;
                int len = 1;
                while(set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLength = Math.max(len, maxLength);
            }

        }
        return maxLength;
    }

    public static int lis(int[] nums) {
        int maxCount = 0;
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]<nums[j]){
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(lis(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(consecutiveElement(new int[] {100, 4, 200, 1, 3, 2}));
    }
}
