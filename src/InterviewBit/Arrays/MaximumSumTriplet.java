package InterviewBit.Arrays;

import java.util.*;

public class MaximumSumTriplet {
    public int solve(ArrayList<Integer> a) {

        int n=a.size(),i,ans;
        int max[]=new int[n],small[]=new int[n];
        max[n-1]=0;

        for(i=n-2;i>=0;i--)
            max[i]=Math.max(max[i+1],a.get(i+1));

        TreeSet<Integer> mm=new TreeSet<>();
        small[0]=0;

        for(i=1;i<n;i++)
        {
            mm.add(a.get(i-1));
            Integer p=mm.lower(a.get(i));

            if(p==null)
                small[i]=0;
            else
                small[i]=p;
        }

        ans=0;
        for(i=0;i<n;i++)
        {
            if(small[i]==0||max[i]<=a.get(i))
                continue;
            ans=Math.max(ans,a.get(i)+max[i]+small[i]);
            // System.out.println(a.get(i)+" "+max[i]+" "+small[i]);
        }

        return ans;
    }
}
