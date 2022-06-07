package Contests.Adda247;

import java.util.Arrays;

public class TotalPairs {
    public static int totalPairs(int N, int [] A, int [] B){
        int [] p = new int[N];
        for(int i=0;i<N;i++){
            p[i] = A[i] - B[i];
        }

        Arrays.sort(p);
        int count = 0;
        for(int i=N-1;i>=0;i--){
            for(int j=i-1;j>=0&& p[i]+p[j]>0;j--){
                count++;
            }
        }
        return count;
    }
}
