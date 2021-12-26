package Contests.WeeklyContests;

import java.util.ArrayList;
import java.util.HashMap;

public class IntervalBetweenIdenticalElements {

    // Time Limit Exceeded
    public long[] getDistances(int[] arr) {
        long[] interv = new long[arr.length];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> vals = new ArrayList<>();
            if(map.containsKey(arr[i])) {
                vals = map.get(arr[i]);
            }
            vals.add(i);
            map.put(arr[i],vals);
        }
        for(int i=0;i<arr.length;i++){
            long sum = 0l;
            ArrayList<Integer> vals = map.get(arr[i]);
            for(int j=0;j<vals.size();j++){
                sum += Math.abs(i-vals.get(j));
            }
            interv[i] = sum;
        }
        return interv;
    }
}
