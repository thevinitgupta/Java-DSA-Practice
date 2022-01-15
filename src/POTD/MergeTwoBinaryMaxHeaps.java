package POTD;

import java.util.Collections;
import java.util.PriorityQueue;

public class MergeTwoBinaryMaxHeaps {
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int ans[]=new int[n+m];
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        for (int i:a){
            priorityQueue.add(i);
        }
        for (int i:b){
            priorityQueue.add(i);
        }
        for (int i=0;i<n+m;i++){
            ans[i]=priorityQueue.poll();
        }
        return ans;
    }
}
