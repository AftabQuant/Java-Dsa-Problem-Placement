package SlidingWindow;

public class LongestSubArrayDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int maxLen = 0;
        int zero=0; int i=0; int j;
        while(i<nums.length && nums[i]!=1) i++;
        if (i == nums.length) return 0;
        j = i;
        while(j < nums.length) {
            if(nums[j]==1) j++;
            else {
                if(zero ==0) {
                    j++; zero ++;
                }
                else {
                    int len = j-i-1;
                    maxLen = Math.max(len, maxLen);
                    zero--;
                    while(i<nums.length && nums[i]==1) i++;
                    i++;
                }
            }
        }
        if(zero==0){
            return nums.length -1;
        }
        int len = j-i-1;
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }
}
