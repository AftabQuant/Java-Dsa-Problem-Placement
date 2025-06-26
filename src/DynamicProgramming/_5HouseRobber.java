package DynamicProgramming;
import java.util.*;

public class _5HouseRobber {
    public int amount(int[] ar, int n, int[] dp) {
        if(n >= ar.length) return 0;
        if(dp[n]!=-1) return dp[n];
        int take = ar[n] + amount(ar, n+2, dp);
        int skip = amount(ar, n+1, dp);
        return dp[n] = Math.max(take, skip);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return amount(nums, 0, dp);
    }

    public int robTabulation(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for(int i=2; i<n; i++) {
            dp[i] = Math.max((nums[i]+dp[i-2]), dp[i-1]);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {

    }
}
