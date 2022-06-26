package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        // 2,4,1,4332,0
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<A.size();i++){
            if(A.get(i)>0) pq.add(A.get(i));
        }
        int f = 1, last = pq.size();
        if(last==0) return f;

        while(!pq.isEmpty() && f==pq.peek()){
            pq.poll();
            f++;
        }
        if(pq.isEmpty()) return last+1;
        else return f;
    }
}
