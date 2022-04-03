package DynamicProgramming;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit2(int[] prices) {
        int b = 0, s = 0, n = prices.length, curr = 0, tot = 0;
        while(curr< n && b<n && s<n){
            //buy a stco kand hold it until the price starts dropping and sell on the day before the drop
            while(curr<n && prices[curr]>=prices[s]){
                s = curr;
                curr++;
            }
            tot += prices[s]- prices[b];
            b = curr; s = curr;
        }
        return tot;
    }
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
