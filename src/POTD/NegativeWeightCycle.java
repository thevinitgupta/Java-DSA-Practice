package POTD;

import java.util.Arrays;

public class NegativeWeightCycle {
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int[] dis=new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<edges.length;j++){
                if(dis[edges[j][0]] != Integer.MAX_VALUE && dis[edges[j][0]]+edges[j][2]<dis[edges[j][1]]){
                    if(i!=n-1)
                        dis[edges[j][1]] = dis[edges[j][0]] + edges[j][2];
                    else return 1;
                }
            }
        }
        return 0;
    }
}
