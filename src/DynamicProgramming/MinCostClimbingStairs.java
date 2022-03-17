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
    public int minCostClimbingStairs1(int[] cost) {
        int [] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        return minCost1(cost,dp,2);
    }
    public static int minCost1(int [] cost, int [] dp, int k){
        if(k>=cost.length-1) return Math.min(cost[k]+dp[k-2], dp[k-1]);
        dp[k] = Math.min(dp[k-1],dp[k-2]) + cost[k];
        return minCost1(cost,dp,k+1);
    }
}
