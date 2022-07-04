package InterviewBit.TwoPointers;

import java.util.ArrayList;

public class Merge2SortedLists2 {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i=0, j = 0, m = a.size(), n = b.size();
        ArrayList<Integer> sorted = new ArrayList<>();
        while(i<m && j<n){
            if(a.get(i)<b.get(j)){
                sorted.add(a.get(i));
                i++;
            }
            else {
                sorted.add(b.get(j));
                j++;
            }
        }
        while(i<m){
            sorted.add(a.get(i));
            i++;
        }
        while(j<n){
            sorted.add(b.get(j));
            j++;
        }
        a.clear();
        a.addAll(sorted);
    }
}
