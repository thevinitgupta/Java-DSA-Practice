package POTD;

import java.util.HashMap;

public class ConcatenateTwoNumbers {
    long countPairs(int N, int X, int numbers[])
    {
        long ans=0;
        HashMap<String,Integer> mp = new HashMap<>();
        String tmp=String.valueOf(X);
        for(int i:numbers){
            mp.put(String.valueOf(i), mp.getOrDefault(String.valueOf(i), 0) + 1);
        }
        for(int i=0;i+1<tmp.length();i++){
            String p=tmp.substring(0,i+1);
            String q=tmp.substring(i+1);
            long f1=mp.getOrDefault(p, 0);
            long f2=mp.getOrDefault(q, 0);
            if(p.equals(q)){
                ans+=(f1*(f1-1));
            }
            else{
                ans+=f1*f2;
            }
        }

        return ans;
    }
}
