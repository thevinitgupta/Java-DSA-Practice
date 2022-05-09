package InfyTQPrep;

public class Knapsack01 {
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
