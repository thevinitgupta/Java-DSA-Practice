package DynamicProgramming;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        return Math.min(minCost(cost,dp,0), minCost(cost,dp,1));
    }
    public static int minCost(int [] cost, int [] dp,int n){
        if(n>=cost.length) return 0;
        if(n==cost.length-1) return cost[cost.length-1];
        if(dp[n]!=0) return dp[n];
        dp[n] = cost[n] +  Math.min(minCost(cost,dp,n+1), minCost(cost, dp, n+2));
        return dp[n];
    }
}
