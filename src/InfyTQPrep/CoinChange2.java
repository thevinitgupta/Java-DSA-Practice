package InfyTQPrep;

public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int [][] dp = new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=amount;j++){
                if(j==0) dp[i][j] =1;
                else if(i==0) dp[i][j] = 0;
                else {
                    int include = 0, dont = dp[i-1][j];
                    if(j-coins[i-1]>=0){
                        include = dp[i][j-coins[i-1]];
                    }
                    dp[i][j] = include + dont;
                }
            }
        }
        return dp[n][amount];
    }
}
