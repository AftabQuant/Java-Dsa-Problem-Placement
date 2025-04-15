package SlidingWindow;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int i=0; int j=0; int prod = 1;
        while(j<nums.length && prod<k) {
            count++;
            prod *= nums[j++];
        }
        j--;
        return count;
    }
}
