package DynamicProgramming;

public class BestTimeToBuyAndSellStockWithTransactionFees {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int [] bProfit = new int[n];
        int [] sProfit = new int[n];
        bProfit[0] = -prices[0];
        for(int i=1;i<n;i++){
            sProfit[i] = Math.max(sProfit[i-1], (prices[i]+bProfit[i-1])-fee);
            bProfit[i] = Math.max(bProfit[i-1], sProfit[i-1]-prices[i]);
        }
        return Math.max(bProfit[n-1],sProfit[n-1]);
    }
}
