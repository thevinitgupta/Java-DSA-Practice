package Array;

import java.util.HashMap;

public class SmallestAbsoluteDifference {

    //TLE For very large input
    public static long kthDiff(long arr[], long n, long k)
    {
        long val = 0,min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        HashMap<Long, Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long diff = Math.abs(arr[i]-arr[j]);
                long curr = 0;
                if(map.containsKey(diff)){
                    curr = map.get(diff);
                }
                curr++;
                map.put(diff,curr);
                min = Math.min(min,diff);
                max = Math.max(max,diff);
            }
        }
        for(long i = min;i<=max;i++){
            if(map.containsKey(i)){
                long freq = map.get(i);
                if(freq>=k) return i;
                else k-= freq;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        long A[] = {1, 2, 3, 4};
        System.out.println(kthDiff(A,4,5));
    }
}
