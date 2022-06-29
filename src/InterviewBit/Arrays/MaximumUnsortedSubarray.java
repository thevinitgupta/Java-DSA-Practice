package InterviewBit.Arrays;

import java.util.ArrayList;

public class MaximumUnsortedSubarray {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> a) {
        int n=a.size();
        int l=n,r=-1;
        int mx=a.get(0);
        for(int i=1;i<n;i++)
        {
            if(a.get(i)<mx)
            {
                int j=i-1;
                while(j>=0 && a.get(i)<a.get(j))
                {
                    j--;
                }

                l=Math.min(l,j+1);
                r=Math.max(r,i);
            }
            else
            {
                mx=Math.max(mx,a.get(i));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(r==-1){
            ans.add(-1);
            return ans;
        }
        ans.add(l);
        ans.add(r);
        return ans;
    }
}
