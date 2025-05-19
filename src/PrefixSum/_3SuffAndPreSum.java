package PrefixSum;

public class _3SuffAndPreSum {
    static void print(int[] nums) {
        for(int ele: nums) System.out.print(ele+" ");
        System.out.println();
    }
    static int[] prefix(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }
    static int[] suffix(int[] nums) {
        int[] res = new int[nums.length];
        res[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--) {
            res[i] = res[i+1] + nums[i];
        }
        return res;
    }
    public static int waysToSplitArray(int[] nums) {
        int[] pre = prefix(nums);
        int[] suf = suffix(nums);
        int count = 0;
        for(int i=0; i<nums.length-1; i++) {
            if(pre[i] >= suf[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10, 4, -8, 7};
        suffix(nums);
        print(nums );
    }
}
