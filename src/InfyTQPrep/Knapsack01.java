package InfyTQPrep;

public class Knapsack01 {

    //dp solution
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int [][] dp = new int[n][W+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<=W;j++){
                if(j-wt[i]>=0){
                    dp[i][j] = Math.max(i-1>=0 ? dp[i-1][j] : 0, (i-1>=0 ? dp[i-1][j-wt[i]] : 0)+val[i]);
                }
                else dp[i][j] = i-1>=0 ? dp[i-1][j] : 0;
            }
        }

        return dp[n-1][W];
    }


    static int knapSackRecursive(int W, int wt[], int val[], int n)
    {
         return Math.max(getMax(W,wt,val,0,1,n), getMax(W-wt[0],wt,val,val[0],1,n));
    }
     static int getMax(int W, int wt[], int val[], int profit, int start, int n){
         // System.out.println(W+", "+profit+", "+start);
         if(W<0) return 0;
         if(start>=n || W==0) return profit;

         start++;

         return Math.max(getMax(W,wt,val,profit,start,n), getMax(W-wt[start-1],wt,val,profit+val[start-1],start,n));
     }
}
