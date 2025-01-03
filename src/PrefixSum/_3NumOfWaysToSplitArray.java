package PrefixSum;

public class _3NumOfWaysToSplitArray {
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length, count = 0;
        long[] a = new long[n];
        long[] b = new long[n];
        a[0] = nums[0]; b[n-1] = nums[n-1];
        for(int i=1; i<n; i++) a[i] = a[i-1] + nums[i];
        for(int i=n-2; i>=0; i--) b[i] = b[i+1] + nums[i];
        for(int i=0; i<n-1; i++) {
            if(a[i]>=b[i+1]) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {10,14,6,13};
        System.out.println(waysToSplitArray(arr));
    }
}
