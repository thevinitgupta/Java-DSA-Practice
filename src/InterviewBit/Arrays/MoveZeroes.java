package InterviewBit.Arrays;

import java.util.ArrayList;

public class MoveZeroes {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int i=0, j = 0;
        while(i<A.size() && j<A.size()){
            if(A.get(j)!=0){
                int temp = A.get(j);
                A.set(j, A.get(i));
                A.set(i,temp);
                i++;
            }
            j++;
        }
        return A;
    }
}
