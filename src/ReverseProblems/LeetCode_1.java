package ReverseProblems;

public class LeetCode_1 {
    public static void swapFunc(int[] nums, int i, int j) {
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    public static void reverseArray(int[] nums) {
        int i=0, j = nums.length-1;
        while(i<j) {
            swapFunc(nums, i, j);
            i++; j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        swapFunc(nums, 0, nums.length-1);
        swapFunc(nums, 0, k-1);
        swapFunc(nums, k, nums.length-1);
    }
    public static void print(int[] nums) {
        for(int ele : nums) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        print(nums);
        rotate(nums, 3);
        print(nums);
    }
}
