package InterviewBit.BinarySearch;

import java.util.ArrayList;

public class SmallerOrEqualElements {
    public int solve(ArrayList<Integer> A, int B) {
        if(A.get(A.size()-1)<B) return A.size();
        int count = 0;
        int low = 0, high = A.size()-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(A.get(mid)==B){
                if(mid+1<A.size() && A.get(mid+1)==B) {
                    low = mid+1;
                }
                else {
                    count = mid+1;
                    break;
                }
            }
            else if(A.get(mid)>B){
                if(mid-1>=0 && A.get(mid-1)<B){
                    count = mid;
                    break;
                }
                high = mid-1;
            }
            else {
                if(mid+1<A.size() && A.get(mid+1)>B){
                    count = mid+1;
                    break;
                }
                low = mid+1;
            }
        }

        return count;
    }
}
