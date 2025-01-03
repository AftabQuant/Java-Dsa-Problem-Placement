package PrefixSum;

public class _5FindPrefixScore {
    public static long[] findPrefixScore(int[] nums) {
        int n = nums.length; int max = Integer.MIN_VALUE;
        long[] res = new long[n];
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            max = Math.max(max, nums[i]);
            a[i] = max + nums[i];
        }
        res[0] = a[0];
        for(int i=1; i<n; i++) {
            res[i] = res[i-1] + a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {2,3,7,5,10};
        long[] res = findPrefixScore(ar);
        for(long x : res) {
            System.out.print(x +" ");
        }
    }
}
