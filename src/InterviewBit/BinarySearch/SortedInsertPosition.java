package InterviewBit.BinarySearch;

import java.util.ArrayList;

public class SortedInsertPosition {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int low = 0, high = a.size()-1,ind = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(a.get(mid)==b) {
                ind = mid;
                break;
            }
            else if(a.get(mid)>b){
                if(mid-1>=0 && a.get(mid-1)<b) {
                    ind = mid;
                    break;
                }
                high = mid-1;
            }
            else {
                if(mid+1<a.size() && a.get(mid+1)>b) {
                    ind = mid+1;
                    break;
                }
                low = mid+1;
            }
        }
        if(ind==-1){
            if(a.get(0)>b) ind=0;
            else ind = a.size();
        }
        return ind;
    }
}
