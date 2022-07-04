package InterviewBit.TwoPointers;

import java.util.ArrayList;

public class CountingSubarrays {
    public int solve(ArrayList<Integer> a, int B) {
        int i=0, j = 0, n = a.size(), sum = a.get(0), count = 0;
        while(i<n && j < n){
            if(sum<B) {
                j++;
                if(j>=i) count+= (j-i);
                if(j<n) sum+= a.get(j);
            }
            else {
                sum -= a.get(i);
                i++;
            }
        }
        return count;
    }
}
