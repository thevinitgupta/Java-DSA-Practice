package Array;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeSubsequence {
    static List<Integer> genSubseq(String str, int n, int index, String current, List<Integer> subs)
    {
        if (index==n) {
            return subs;
        }
        if(current.length()>=1 && current.charAt(0)=='0') return subs;

        if (current!=null && !current.trim().isEmpty()) {
            subs.add(Integer.parseInt(current));
        }
        for (int i = index + 1; i < n; i++) {
            current += str.charAt(i);
            subs = genSubseq(str, n, i, current,subs);
            current = current.substring(0, current.length() - 1);
        }
        return subs;
    }
    static int getPrime(String s){
        List<Integer> subs = new ArrayList<>();
        int index = -1;
        String curr = "";
        subs = genSubseq(s,s.length(),index,curr,subs);
        int prime = -1;
        for(int i=0;i<subs.size();i++){
            if(isPrime(subs.get(i))) {
                prime = Math.max(prime, subs.get(i));
            }
        }
        return prime;
    }
    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getPrime("50678"));
    }
}
