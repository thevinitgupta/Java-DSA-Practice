package DynamicProgramming;

public class CountUniqueWaysToReachNthStair {
    public long nthStair(int n)
    {
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        return climb(n,dp);
    }
    public static int climb(int n, int [] dp){
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        return climb(n-2, dp) + 1;
    }
}
