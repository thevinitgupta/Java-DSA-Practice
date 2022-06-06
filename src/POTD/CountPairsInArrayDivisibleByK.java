package POTD;

import java.util.HashMap;

public class CountPairsInArrayDivisibleByK {
    public static long countKdivPairs(int arr[], int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for(int i=0;i<n;i++){

            int rem=arr[i]%k;
            if(rem!=0)
            {
                if(map.containsKey(k-rem))
                    count+=map.get(k-rem);
            }
            else
            {
                if(map.containsKey(rem))
                    count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
