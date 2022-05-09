package InfyTQPrep;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int [] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        Arrays.sort(coins);
        for(int i=coins[0];i<=amount;i++){
            int j=0;
            while(j<coins.length && i-coins[j]>=0){
                dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                j++;
            }
        }
        return dp[amount]==amount+1 ? -1 : dp[amount];
    }
}
