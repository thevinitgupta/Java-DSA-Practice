package POTD;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumNumberOfEventsAttended {
    static class pair{
        int s;
        int e;
        pair(int s,int e){
            this.s=s;
            this.e=e;
        }
    }
    static int maxEvents(int[] start, int[] end, int N) {
        pair[] arr = new pair[N];
        for(int i=0;i<N;i++){
            arr[i]=new pair(start[i],end[i]);
        }
        Arrays.sort(arr,(a, b)->(a.s-b.s));
        Arrays.sort(arr,(a,b)->(a.s-b.s));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0, ans = 0, d = 0;
        while (!pq.isEmpty() || i < N) {
            if (pq.isEmpty())
                d = arr[i].s;
            while (i < N && arr[i].s <= d)
                pq.offer(arr[i++].e);
            pq.poll();
            ++ans; ++d;
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
        }
        return ans;
    }
}
