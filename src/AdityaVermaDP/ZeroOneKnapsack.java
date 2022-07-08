package AdityaVermaDP;

import java.util.Arrays;

public class ZeroOneKnapsack {
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int [][] dp = new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return knapSack(W,wt,val,n,dp);
    }
    static int knapSack(int W, int wt[], int val[], int n, int [][]dp){
        if(n==0 || W==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];
        if(wt[n-1]<=W){
            dp[n][W] =  Math.max(val[n-1]+knapSack(W-wt[n-1], wt,val, n-1,dp), knapSack(W,wt,val,n-1,dp));
        }
        else dp[n][W] = knapSack(W,wt,val,n-1,dp);
        return dp[n][W];
    }
}
