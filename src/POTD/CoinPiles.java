package POTD;

import java.util.Arrays;

public class CoinPiles {
    static int upper_bound(int A[],int L,int R,int K){
        int pos=R+1;
        while(L<=R){
            int M = (L+R)/2;
            if(A[M]>K){
                pos=M;
                R=M-1;
            }else L=M+1;
        }
        return pos;
    }
    static int minSteps(int[] A, int N, int K) {

        int [] a = new int[N];
        int [] p = new int[N];

        for(int i=0; i<N; i++){
            a[i] = A[i];
        }

        Arrays.sort(a);

        p[0] = a[0];

        for(int i=1 ; i<N; i++){
            p[i] = p[i-1] + a[i];
        }

        int ans = Integer.MAX_VALUE, prev = 0;

        for(int i=0; i<N; i++)
        {
            int pos = upper_bound(a,i,N-1,a[i]+K);

            if(i > 0 && a[i] != a[i-1])
                prev = p[i-1];

            ans = Math.min(ans, prev + p[N-1] - p[pos-1] - (N-pos) * (a[i]+K));
        }
        return ans;
    }
}
