package DynamicProgramming;
import java.util.*;

public class _12PerfectSquares {
    public int number(int n, int[] dp) {
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int min = n;
        for(int i=1; i*i<=n; i++) {
            int square = i * i;
            int count = 1 + number(n - square, dp);
            min = Math.min(min, count);
        }
        return dp[n] = min;
    }
    public int numSquares(int n) {
        if(isPerfect(n)) return 1;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return number(n, dp);
    }
    public boolean isPerfect(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt*sqrt == n;
    }
    public int numSquaresTabulation(int n) {
        int[] dp = new int[n+1];
        for(int i=1; i<dp.length; i++) {
            if(isPerfect(i)) dp[i] = 1;
            else {
                int min = n;
                for(int j=1; j*j <= i; j++) {
                    int count = dp[j*j] + dp[i-j*j];
                    min = Math.min(min, count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
}
