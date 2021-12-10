package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n = stones.length;
        if(n<=1) return n;
        int j=n-1,i=n-2,c=0;
        while(c<n-1 && i>=0){
            if(stones[i]==stones[j]) {
                stones[i] = 0;
                stones[j] = 0;
                c += 2;
                j=n-1;i=n-2;
            }
            else if(stones[i]>stones[j]){
                stones[i] -= stones[j];
                stones[j] = 0;
                c++;
                j = n-1;i=n-2;
            }
            else {
                stones[j] -= stones[i];
                stones[i] = 0;
                c++;
                j=n-1;i=n-2;
            }
            Arrays.sort(stones);
        }
        return stones[n-1];
    }
}
