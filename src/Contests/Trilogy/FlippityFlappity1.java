package Contests.Trilogy;

import java.util.ArrayList;

public class FlippityFlappity1 {
    public ArrayList<Long> solve(int A, ArrayList<ArrayList<Integer>> B){
        int [] x = new int[A];
        long [] y = new long[A];
        ArrayList<Long> ans = new ArrayList<>();
        for(int i=0;i<B.size();i++){
            ArrayList<Integer> curr = B.get(i);
            if(curr.get(0)==1){
                int l = curr.get(1)-1, r = curr.get(2)-1;
                for(int j=l;j<=r;j++){
                    if(x[j]==0) x[j] = 1;
                    else if(x[j]==1) x[j]=0;
                }
            }
            else if(curr.get(0)==2){
                int p = curr.get(1);
                for(int j=0;j<A;j++){
                    y[j] += x[j]*p;
                }
            }
            else {
                ans.add(y[curr.get(1)-1]);
            }
        }
        return ans;
    }
}
