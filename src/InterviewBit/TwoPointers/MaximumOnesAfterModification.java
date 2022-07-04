package InterviewBit.TwoPointers;

import java.util.ArrayList;

public class MaximumOnesAfterModification {
    public int solve(ArrayList<Integer> A, int B) {
        int i=0,j=0, steps = B, max = 0;
        while(i<A.size() && j<A.size()){
            if(A.get(j)==1) j++;
            else {
                if(steps>0) {
                    steps--;
                    j++;
                }
                else {
                    while(steps==0 && i<j){
                        if(A.get(i)==0){
                            steps++;
                        }
                        i++;
                    }
                }
            }
            max = Math.max((j-i), max);
        }
        return max;
    }
}
