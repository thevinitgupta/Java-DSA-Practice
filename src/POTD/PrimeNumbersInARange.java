package POTD;

import java.util.ArrayList;

public class PrimeNumbersInARange {
    public boolean isprime(int n){
        if(n==1 || n==0)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    ArrayList<Integer> o1 = new ArrayList<>();
    ArrayList<Integer> primeRange(int M, int N) {
        for(int i=M;i<=N;i++){
            if(isprime(i))
                o1.add(i);
        }
        return o1;
    }
}
