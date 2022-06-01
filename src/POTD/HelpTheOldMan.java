package POTD;

import java.util.Arrays;
import java.util.List;

public class HelpTheOldMan {
    static int n1,n2,k;
    static void solve(int n, int a, int c, int b, int l){
        if(n==0) return;
        solve(n-1,a,b,c,l);
        k++;
        if(k==l){
            n1 = a;
            n2 = c;
            return;
        }
        solve(n-1,b,c,a,l);
    }

    static List<Integer> shiftPile(int N, int n){
        // code here
        k=0;
        solve(N,1,3,2,n);
        return Arrays.asList(n1,n2);
    }
}
