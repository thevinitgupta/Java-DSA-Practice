package InterviewBit.BinarySearch;

import java.util.ArrayList;

public class SearchInBitonicArray {
    public int solve(ArrayList<Integer> a, int B) {
        int n = a.size(), low = 0, high = n-1, pivot = a.get(0)>a.get(n-1) ? 0 : n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid+1<n && mid-1>=0 && a.get(mid)>a.get(mid-1) && a.get(mid)>a.get(mid+1)){
                pivot = mid;
                break;
            }
            else {
                if(mid+1<n && a.get(mid)<a.get(mid+1)) low = mid+1;
                else high = mid-1;
            }
        }


        if(a.get(pivot)==B) return pivot;

        if(B<a.get(pivot) && B>=a.get(n-1)){
            low = pivot+1;
            high = n-1;
        }
        else {
            low = 0;
            high = pivot-1;
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            if(a.get(mid)==B){
                return mid;
            }
            else if(mid+1<n && a.get(mid)<a.get(mid+1)){
                if(B>a.get(mid)) low = mid+1;
                else high = mid-1;
            }
            else {
                if(B<a.get(mid)) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;

    }
}
