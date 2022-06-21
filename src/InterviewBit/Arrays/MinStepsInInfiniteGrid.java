package InterviewBit.Arrays;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0,i=0,j=1;
        while(j<A.size()){
            int d1 = Math.abs(A.get(j)-A.get(i)), d2 = Math.abs(B.get(j)-B.get(i));
            count += Math.max(d1,d2);
            i++;
            j++;
        }


        return count;
    }
}
