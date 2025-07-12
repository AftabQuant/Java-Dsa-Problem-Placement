package DynamicProgramming;
import java.util.*;

public class _8UniquePaths {
    public static int paths(int m, int n, int[][] dp) {
        if(m <= 1 || n <= 1) return 1;
        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = paths(m-1, n, dp) + paths(m, n-1, dp);
    }
    public static int uniquePaths(int m, int n) {
        if(m <= 1 || n <= 1) return 1;
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return paths(m, n, dp);
    }

    // Tabulation Method
    public static int uniquePathsTabulation(int m, int n) {
        if(m <= 1 || n <= 1) return 1;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++) dp[i][0] = 1;
        for(int j=1; j<n; j++) dp[0][j] = 1;
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {

        System.out.println(uniquePaths(3,7));


    }
}
