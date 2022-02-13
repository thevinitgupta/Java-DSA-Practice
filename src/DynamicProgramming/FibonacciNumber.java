package DynamicProgramming;

import java.util.Arrays;

public class FibonacciNumber {
    public int fib(int n) {
        if(n<=1) return n;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        return getFib(n,dp);
    }
    public static int getFib(int n, int [] dp){
        if(dp[n]!=-1) return dp[n];
        dp[n] = getFib(n-1,dp)+getFib(n-2,dp);
        return dp[n];
    }
}
