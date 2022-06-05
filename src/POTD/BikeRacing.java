package POTD;

public class BikeRacing {
    boolean check(long T, long L, long S[], long A[], long N, long M){

        long ans = 0;

        for(int i=0;i<N; i++){

            long x = S[i]+A[i]*T;

            ans += (x>=L ? x : 0);

        }

        return ans >= M;

    }

    long buzzTime(long N, long M, long L, long H[], long A[])

    {

        // code here

        long low,high,mid;

        low = 0;high = M;



        while(low<high){

            mid = low +(high-low)/2;

            if(check(mid, L, H,A, N,M))

                high = mid;

            else

                low = mid+1;

        }

        return high;

    }
}
