package POTD;

import java.util.Arrays;

public class TripletsWithSumWithinGivenRange {
    static int countTriplets(int Arr[], int N, int L, int R) {
        // code here
        int ct=0,ct1=0;
        Arrays.sort(Arr);
        ct=div(Arr,N,L-1);
        ct1=div(Arr,N,R);
        return ct1-ct;

    }
    static int div(int[] Arr,int n,int x)
    {
        int res=0;
        for(int i=0;i<n-2;i++)
        {
            int k=Arr[i];
            int j=i+1;
            int p=n-1;
            while(j<p)
            {
                int sum=k+Arr[j]+Arr[p];
                if(sum>x)
                    p--;

                else
                {
                    res+=(p-j);
                    j++;
                }
            }
        }
        return res;
    }
}
