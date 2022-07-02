package Contests.GFGStackQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumTimeToEmptyArray {
    public static int minimumTime(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            pq.add(arr[i]);
        }
        int count = 0;
        // System.out.println(list+","+pq);
        while(list.size()>0){
            int front = list.remove(0);
            if(front==pq.peek()){
                pq.poll();
            }
            else list.add(front);
            // System.out.println(list+","+pq);
            count++;
        }
        return count;
    }
}
