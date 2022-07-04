package InterviewBit.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> inter = new ArrayList<>();
        int i=0, j =0, m = A.size(), n = B.size();
        while(i<m && j<n){
            int compare = A.get(i).compareTo(B.get(j));
            if(compare==0){
                inter.add(A.get(i));
                i++;
                j++;
            }
            else if(compare<0){
                i++;
            }
            else j++;
        }
        return inter;
    }
}
