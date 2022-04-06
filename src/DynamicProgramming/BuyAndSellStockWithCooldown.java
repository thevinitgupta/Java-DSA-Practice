package DynamicProgramming;

public class BuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [] ns = new int[n]; //no stock state
        int [] ih = new int[n]; //ih hand state
        int [] sold = new int[n]; //sold state
        ih[0] = -prices[0]; // to have a stock in hand, we have to buy the stock on that day
        for(int i=1;i<n;i++){
            ns[i] = Math.max(ns[i-1],sold[i-1]);
            ih[i] = Math.max(ih[i-1], ns[i-1]-prices[i]);
            sold[i] = Math.max(sold[i-1], ih[i-1]+prices[i]);
        }
        return Math.max(ns[n-1], Math.max(ih[n-1], sold[n-1]));
    }
}
