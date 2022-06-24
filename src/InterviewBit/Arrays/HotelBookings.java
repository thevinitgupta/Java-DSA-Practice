package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class HotelBookings {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int n = arrive.size(), max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(depart.get(0));
        for(int i=0;i<n;i++){
            if(pq.isEmpty()) {
                pq.add(depart.get(i));
            }
            else {
                if(pq.peek()<arrive.get(i))
                    pq.poll();
                pq.add(depart.get(i));
            }
            max = Math.max(pq.size(),max);
        }
        return max<=K;
    }
}
