package ArraysAndHashing;

public class _19LongestIncAndDecSubArray {
    public static int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int mxc = 0;
        for(int i=0; i<n; i++) {
            int cnt = 1;
            for(int j=i+1; j<n; j++) {
                if(nums[j]>nums[j-1]) cnt++;
                else break;
            }
            mxc = Math.max(mxc, cnt);
        }
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=i+1; j<n; j++) {
                if(nums[j]<nums[j-1]) cnt++;
                else break;
            }
            mxc = Math.max(mxc, cnt);
        }
        return mxc;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5};
        System.out.println(longestMonotonicSubarray(arr));
    }
}
