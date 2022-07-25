package InterviewBit.Strings;

import java.util.HashMap;

public class MaximumSubstring {
    public int solve(String A, int B) {
        HashMap<String, Integer> map = new HashMap<>();
        int i=0, j=0,curr = 0, max = 0;
        while(i<A.length() && j<A.length()){
            if((j-i)==B){
                max = Math.max(max,curr);
                curr = 0;
                i=j;
            }
            if(A.charAt(j)=='a') curr++;
            j++;
        }
        max = Math.max(max,curr);
        return max;
    }
}
