package InterviewBit.TwoPointers;

import java.util.ArrayList;

public class RemoveDuplicates2 {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i=0, j = 1;
        while(i<a.size() && j<a.size()){
            int k = j;
            if(a.get(i).equals(a.get(j))) {
                j++;
                k=j;
            }
            while(j<a.size() && a.get(i).equals(a.get(j))){
                j++;
            }
            a.subList(k,j).clear();
            i = k;
            j = i+1;
        }
        return a.size();
    }
}
