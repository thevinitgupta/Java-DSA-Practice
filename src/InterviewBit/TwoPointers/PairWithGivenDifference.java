package InterviewBit.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;

public class PairWithGivenDifference {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            map.put(A.get(i),i);
        }
        for(int i=0;i<A.size();i++){
            int key = B+A.get(i);
            if(map.containsKey(key) && map.get(key)!=i) return 1;
        }
        return 0;
    }
}
