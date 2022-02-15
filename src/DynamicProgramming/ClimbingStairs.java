package DynamicProgramming;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int []dp = new int[n+1];
        dp[0] = 1;
        return getWays(n,dp);
    }
    public static int getWays(int n, int[] dp){
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        dp[n] = getWays(n-1,dp) + getWays(n-2,dp);
        return dp[n];
    }
}
