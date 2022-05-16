package POTD;

import java.util.Arrays;

public class LongestSubarrayWithSumDivisibleByK {
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        if( k==1)
            return n;
        int[] h = new int[(int)1e6+5];
        Arrays.fill(h,-2);
        for(int i=1; i<n; i++)
            a[i] += a[i-1];

        for(int i=0; i<n; i++) {
            a[i] = (a[i]%k+k)%k;
        }

        int idx = 0;
        h[0] = -1;
        for(int i=0; i<n; i++) {
            if( h[a[i]]!=-2 ) {
                if( idx<(i-h[a[i]]) ) {
                    idx = i-h[a[i]];
                }
            }
            else {
                h[a[i]] = i;
            }
        }
        return idx;
    }
}
