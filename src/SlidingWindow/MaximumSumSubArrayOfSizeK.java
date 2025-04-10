package SlidingWindow;

public class MaximumSumSubArrayOfSizeK {
    static int maxSumBruteForce(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-k+1; i++) {
            int sum = 0;
            for(int j=i; j<i+k; j++) {
                sum +=arr[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    static int maxSumSlidingWindow(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++) sum += nums[i];
        int max = sum;
        int i=1; int j=k;
        while(j<nums.length) {
            sum = sum - nums[i-1] + nums[j];
            i++; j++;
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, 40, 80, 10};
        System.out.println(maxSumBruteForce(arr, 3));
        System.out.println(maxSumSlidingWindow(arr, 3));
    }
}
