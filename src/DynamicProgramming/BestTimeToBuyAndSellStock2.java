package DynamicProgramming;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int max = 0, prev = prices[0];
        boolean bought = true;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=prev){
                prev = prices[i];
            }
            else if(bought && prices[i]>prev){
                //System.out.println(prices[i]+", "+prev);
                max += prices[i]-prev;
                prev = prices[i];
            }
        }
        return max;
    }
}
