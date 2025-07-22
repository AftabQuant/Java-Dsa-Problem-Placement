package LeetCodeProblem;
import java.util.*;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=1; i<n; i++) {
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    static void print(int[] res) {
        System.out.println();
        for(int ele : res) {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        removeDuplicates(arr);
        print(arr);
    }
}
