package DynamicProgramming;

import java.util.Arrays;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        return getTrib(n,dp);
    }
    public static int getTrib(int n, int []dp){
        if(dp[n]!=-1) return dp[n];
        dp[n] = getTrib(n-1,dp) + getTrib(n-2,dp) + getTrib(n-3, dp);
        return dp[n];
    }
}
