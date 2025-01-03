package PrefixSum;

import java.util.Arrays;

public class _4FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] a = Arrays.copyOf(nums,n);
        int[] b = Arrays.copyOf(nums,n);
        for(int i=1; i<n; i++) a[i] = a[i-1] + nums[i];
        for(int i=n-2; i>=0; i--) b[i] = b[i+1] + nums[i];
        for(int i=0; i<n; i++) {
            if(a[i]==b[i]) return i;
        }
        return -1;
    }
    public int pivotIndex1(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int rs = 0, ls = 0;
            for(int j=0; j<=i; j++) {
                rs += nums[j];
            }
            for(int j = i+1; j<n; j++) {
                ls += nums[j];
            }
            if(ls == rs) return i;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
