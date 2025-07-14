package DynamicProgramming;

public class _1FibonacciNumber {
    public static int fibo(int n, int[] dp){
        if(n<2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
    }
    public static int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n, dp);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        StringBuilder sb = new StringBuilder();
        sb.reverse();
        sb.deleteCharAt(sb.length()-1);
    }
}
