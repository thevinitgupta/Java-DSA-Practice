package POTD;

import java.util.PriorityQueue;

public class HelpAThief {
    static int maxCoins(int[] plates, int[] coins, int t, int n) {
        if(t==0) return 0;
        PriorityQueue<int []> pq=new PriorityQueue<>((a, b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            pq.add(new int []{plates[i],coins[i]});
        }
        int res=0;
        while(t>0&&!pq.isEmpty()){
            int []p=pq.poll();
            for(int i=0;i<p[0]&&t-->0;i++){
                res+=p[1];
            }
        }
        return res;
    }
}
