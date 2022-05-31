package Contests.Wipro;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class SumofPrimeIndexValues {
    public static int sum(int [] input1, int input2){
        int sum = 0;
        if(input2<=2) return 0;

        boolean [] prime = new boolean[input2];
        for(int i=2;i<input2;i++){
            for(int j=i+1; prime[i] && j<input2;j+=i){
                prime[j] = true;
            }
        }
        for(int i=0;i<input2;i++){
            if(prime[i]) sum+=input1[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Object o = new LinkedHashMap();
        System.out.println((o instanceof Map)+",");
        System.out.println((o instanceof SortedMap));

    }
}
