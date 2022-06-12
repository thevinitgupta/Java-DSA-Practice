package Contests.Trilogy;

import java.util.ArrayList;

public class XORSumOfOR {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B){
        int ans = 0;
        for(int i=0;i<A.size();i++){
            for(int j=0;j<B.size();j++){
                int curr = A.get(i)|B.get(j);
                ans ^= curr;
            }
        }
        return ans;
    }
}
