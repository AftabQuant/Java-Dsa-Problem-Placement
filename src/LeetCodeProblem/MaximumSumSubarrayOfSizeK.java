package LeetCodeProblem;

import java.util.HashSet;

public class MaximumSumSubarrayOfSizeK {
    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int maxSum = 0, currentSum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            currentSum += nums[end];
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 3};
        System.out.println(maximumSubarraySum(arr, 3));
    }
}
