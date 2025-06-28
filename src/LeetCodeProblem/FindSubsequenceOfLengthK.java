package LeetCodeProblem;

public class FindSubsequenceOfLengthK {
    public static int[] maxSubsequence(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        int n = nums.length;
        int[] res = new int[k];
        for(int i=0; i<k; i++) sum += nums[i];
        maxSum = Math.max(sum, maxSum);
        for(int i=k; i<n; i++) {
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(sum, maxSum);
            if(maxSum == sum) {
                res[0] = nums[i-1];
                res[1] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 3};
        System.out.println(maxSubsequence(arr, 2));
    }
}
