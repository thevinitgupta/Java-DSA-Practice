package InterviewBit.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class PairsWithGivenXOR {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(A.get(0)^B, 1);
        for(int i=1;i<A.size();i++){
            int xor = B^A.get(i);
            // System.out.println(xor+", "+map);
            int curr = 0;
            if(map.containsKey(A.get(i))){
                count += map.get(A.get(i));
                curr = map.get(A.get(i));
                // System.out.println("Present : "+curr);
            }
            curr++;
            map.put(xor,curr);
        }
        return count;
    }
}
