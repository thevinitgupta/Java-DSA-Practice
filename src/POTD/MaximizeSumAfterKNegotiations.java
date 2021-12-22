package POTD;

import java.util.Arrays;

public class MaximizeSumAfterKNegotiations {
    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here
        Arrays.sort(a);
        int i=0;
        long sum =0l;
        while(i<n){
            if(k>0 && a[i]<0){
                a[i] = -a[i];
                k--;
            }
            sum += a[i];
            i++;
        }
        Arrays.sort(a);
        if(k%2!=0) {
            sum -= 2*a[0];

        }
        return sum;
    }
}
