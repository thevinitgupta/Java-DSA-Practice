package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int high = A.size()-1;
        while(high>0 && A.get(high)<A.get(high-1)){
            high--;
        }
        Collections.sort(A.subList(high,A.size()));
        if(high==0) return A;

        high--;
        int ptr = high+1;
        while(A.get(high)>A.get(ptr)) ptr++;
        int temp = A.get(high);
        A.set(high,A.get(ptr));
        A.set(ptr,temp);
        return A;
    }
}
