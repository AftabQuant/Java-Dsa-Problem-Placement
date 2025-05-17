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
    public static boolean isPrimeNum(int num) {
        if(num < 2) return false;
        for(int i=2; i<Math.sqrt(num); i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
    public static void printPrime(int num) {
        for(int i=2; i<=num; i++) {
            if(isPrimeNum(i)) System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(16));
        System.out.println(isPrimeNum(17));
        printPrime(50);
    }
}
