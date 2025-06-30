package DynamicProgramming;

import java.util.Arrays;

public class _7CountDerangements {
    private static int[] dp;
    private static int countDer(int n) {
        // Base case
        if(n == 1) return 0;
        else if(n == 2) return 1;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        if(dp[n] != -1) return dp[n];
        return dp[n] = (n-1) * (countDer(n-1) + countDer(n-2));
    }

    public static void main(String[] args) {
        System.out.println(countDer(4));
    }
}
