package PrefixSum;

public class _1RunningSum {
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            nums[i] +=nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {

    }
}
