package InterviewBit.Mathematics;

import java.util.ArrayList;
import java.util.List;

public class NextSimilarNumber {
    public String solve(String A) {
        StringBuilder str = new StringBuilder(A);
        List<Character> pq = new ArrayList<>();

        int ptr = A.length()-1;
        pq.add(A.charAt(ptr));
        ptr--;

        while(ptr>=0 && pq.get(pq.size()-1)<=A.charAt(ptr)){
            pq.add(A.charAt(ptr));
            ptr--;
        }

        if(pq.size()==A.length()) return "-1";

        char curr = A.charAt(ptr);

        for(int i=0;i<pq.size();i++){
            if(curr<pq.get(i)){
                str.setCharAt(ptr,pq.get(i));
                pq.set(i,curr);
                break;
            }
        }

        ptr++;
        for(int i=0;i<pq.size();i++){
            str.setCharAt(ptr,pq.get(i));
            ptr++;
        }
        return str.toString();
    }
}
