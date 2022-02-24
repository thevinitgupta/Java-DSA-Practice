package POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnTwoPrimeNumbers {
    static List<Integer> primeDivision(int n){

        //creation of Sieve of Eratosthenes
        boolean [] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,2,n+1,true);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                for(int j=2;(i*j)<=n;j++){
                    isPrime[i*j] = false;
                }
            }
        }

        //checking prime numbers that sum of to the given integer
        List<Integer> factors = new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(isPrime[i] && isPrime[n-i]) {
                factors.add(i);
                factors.add(n-i);
                return factors;
            }
        }
        return factors;
    }
}
