package DynamicProgramming;

public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if(n<=1) return n;
        int []dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        return getMax(2,n,dp,1);
    }
    public static int getMax(int k, int n, int [] dp,int max){
        if(k>n) return max;
        if(k%2==0) dp[k] = dp[k/2];
        else dp[k] = dp[k/2] + dp[(k/2)+1];
        max = Math.max(dp[k],max);
        return Math.max(max,getMax(k+1,n,dp,max));
    }
}
