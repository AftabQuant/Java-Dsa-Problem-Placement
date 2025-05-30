package PrefixSum;

public class _4ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        pre[0] = 1 ; suf[nums.length-1] = 1;
        for(int i=1; i<nums.length; i++) pre[i] = pre[i-1] * nums[i-1];
        for(int i=nums.length-2; i>=0; i--) suf[i] = suf[i+1] * nums[i+1];
        for(int i=0; i<nums.length; i++) nums[i] = pre[i] * suf[i];
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        nums = productExceptSelf(nums);
        for(int ele: nums) System.out.print(ele+" ");
        System.out.println();
    }
}
