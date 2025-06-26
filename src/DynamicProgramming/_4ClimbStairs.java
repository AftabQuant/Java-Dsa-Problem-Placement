package DynamicProgramming;

public class _4ClimbStairs {
    public static int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n+1];
        return climb(n, dp);
    }
    public static int climb(int n, int[] dp) {
        if(n <= 2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = climb(n-1, dp) + climb(n-2, dp);

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
