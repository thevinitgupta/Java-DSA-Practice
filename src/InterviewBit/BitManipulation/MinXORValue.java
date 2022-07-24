package InterviewBit.BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

public class MinXORValue {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            min = Math.min(min, A.get(i)^A.get(i+1));
        }
        return min;
    }
}
