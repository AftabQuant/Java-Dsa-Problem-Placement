package DynamicProgramming;

public class _1FibonacciNumberMemoization {
    public static int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n, dp);
    }

    public static int fibo(int n, int[] dp) {
        if(n <= 1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
