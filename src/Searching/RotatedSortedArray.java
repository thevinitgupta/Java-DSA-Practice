package Searching;

import java.util.List;

public class RotatedSortedArray {
    public int search(final List<Integer> A, int B) {
        //pivot
        int low = 0, high = A.size()-1, pivot = 0;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(mid-1>=0 && A.get(mid-1)>A.get(mid)){
                pivot = mid-1;
                break;
            }
            else if(mid+1<A.size() && A.get(mid+1)<A.get(mid)){
                pivot = mid;
                break;
            }
            else {
                if(A.get(low)>A.get(mid)) high = mid-1;
                else low = mid+1;
            }
        }

        if(B<=A.get(pivot) && B>=A.get(0)) {
            low = 0;
            high = pivot;
        }
        else {
            low = pivot+1;
            high = A.size()-1;
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            if(B==A.get(mid)){
                return mid;
            }

            else {
                if(B>A.get(mid)) low = mid+1;
                else high = mid-1;
            }
        }

        return -1;
    }
}
