package DynamicProgramming;

import java.util.Arrays;

public class _6FriendPairingProblems {
    public static int findPair(int n, int[] dp) {
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n]= findPair(n-1, dp) + (n-1) * findPair(n-2, dp);
    }
    public static int res(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return findPair(n, dp);
    }
    public static void main(String[] args) {
        System.out.println(res(10));
    }
}
