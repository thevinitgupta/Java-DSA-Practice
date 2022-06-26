package InterviewBit.Mathematics;

import java.util.ArrayList;

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        boolean [] notPrime = new boolean[A+1];
        notPrime[0] = true;
        notPrime[1] = true;

        for(int i=2;i<=A/2;i++){
            int j=2;
            if(notPrime[i]==false){
                while(i*j<=A){
                    notPrime[i*j] = true;
                    j++;
                }
            }
        }

        ArrayList<Integer> pSum = new ArrayList<>();
        for(int i=2;i<A+1;i++){
            if(notPrime[i]==false && notPrime[A-i]==false){
                pSum.add(i);
                pSum.add(A-i);
                return pSum;
            }
        }

        return pSum;

    }
}
