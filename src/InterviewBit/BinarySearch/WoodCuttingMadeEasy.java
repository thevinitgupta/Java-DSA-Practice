package InterviewBit.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class WoodCuttingMadeEasy {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();
        int ans = 0;
        int low = A.get(0), high = A.get(n-1);
        while(low<=high){
            int mid = low + (high-low)/2;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += A.get(i)>mid ? A.get(i)-mid : 0;
                if(sum>B) break;
            }
            if(sum>=B){
                low = mid+1;
                ans = Math.max(ans,mid);
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
