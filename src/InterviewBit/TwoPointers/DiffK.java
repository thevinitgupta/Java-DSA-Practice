package InterviewBit.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;

public class DiffK {
    public int diffPossible(ArrayList<Integer> A, int B) {
        if(A.size()<=1) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            int  curr = 0;
            if(map.containsKey(A.get(i))){
                if(B==0) return 1;
                curr = map.get(A.get(i));
            }
            curr++;
            map.put(A.get(i),curr);
        }
        for(int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i)+B)) {
                if(B==0){
                    if(map.get(A.get(i))>1) return 1;
                    else return 0;
                }
                else return 1;
            }
        }
        // System.out.println(map);
        return 0;
    }
}
