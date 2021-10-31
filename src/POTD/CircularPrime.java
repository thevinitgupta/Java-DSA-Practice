package POTD;

import java.util.ArrayList;
import java.util.Collections;

public class CircularPrime {
    public static boolean isPrime(int n){
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++)
        {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true)
            {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime[n];
    }
    public int isCircularPrime(int n){
        String str = Integer.toString(n);
        if(n<10)
        {
            if(n==2||n==3||n==5||n==7)
                return 1;
            return 0;
        }
        for(int i=0;i<str.length();i++)
        {
            int t = Integer.parseInt(str);
            if(isPrime(t)==false)
                return 0;
            str = str.substring(1)+str.charAt(0);
        }
        return 1;
    }
}
