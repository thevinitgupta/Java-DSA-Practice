package POTD;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaxProdOfIncreasingSubsequenceOfSize3 {
    public static ArrayList<Integer> maxProductSubsequence (int arr[], int n) {
        //Complete the function
        long ans = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        if(arr.length<3)
        {
            ar.add(-1);
            return ar;
        }

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(arr[0]);
        long b = 0;
        for(int i =2;i<arr.length;i++)
        {
            b=Math.max(b,arr[i]);
        }
        for(int i =1;i<arr.length-1;i++)
        {
            if(arr[i]==b)
            {
                b=0;
                for(int j =i+1;j<arr.length;j++)
                {
                    b=Math.max(b,arr[j]);
                }
            }
            long a=-1;
            if(ts.first()<arr[i])
            {
                a = ts.floor(arr[i]-1);
            }
            if(b>arr[i] && a > -1)
            {
                long t = a*b*(long)arr[i];
                if(t>ans)
                {
                    ans=t;
                    ar.clear();
                    ar.add((int)a);
                    ar.add(arr[i]);
                    ar.add((int)b);
                }
            }
            ts.add(arr[i]);
        }
        if(ar.size()==0) ar.add(-1);
        return ar;
    }


}
