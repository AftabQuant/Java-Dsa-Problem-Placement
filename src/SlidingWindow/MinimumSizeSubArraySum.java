package SlidingWindow;

public class MinimumSizeSubArraySum {
//    public static int minSubArrayLen(int target, int[] nums) {
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<nums.length; i++) {
//            int sum =0; int len = 0;
//            for(int j=i; j<nums.length; j++) {
//                sum += nums[j];
//                if(sum >= target) {
//                    len = j-i+1;
//                    min = Math.min(min, len);
//                    break;
//                }
//            }
//
//        }
//        return min == Integer.MAX_VALUE ? 0 : min;
//    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int i=0; int j=0; int sum=0;
        while(j<nums.length && sum<target){
            sum += nums[j++];
        }
        j--;
        while(i<nums.length && j<nums.length) {
            int len = j-i+1;
            if(sum>=target) minLen = Math.min(len, minLen);
            sum -= nums[i];
            i++; j++;
            while(j<nums.length && sum<target){
                sum += nums[j++];
            }
            j--;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
}
