package DynamicProgramming;

public class BestTimeToBuyAndSellStock {
    public int maxProfitBottomUp(int[] prices) {
        int n = prices.length, maxProfit = 0;
        int rightMax = prices[n-1];
        for(int i= n-2;i>=0;i--){
            maxProfit = Math.max(maxProfit, rightMax - prices[i]);
            rightMax = Math.max(rightMax, prices[i]);
        }
        return maxProfit;
    }
    public int maxProfit(int[] prices) {
        int profit = 0,min = prices[0];
        for(int i=1;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}
