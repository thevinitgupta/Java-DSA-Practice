package Contests.WeeklyContests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllDivisionsWithHighestScoreOfBinary {
    public List<Integer> maxScoreIndices(int[] nums) {
        int lo = 0,rz = 0,n = nums.length,max = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==1) lo++;
        }
        HashMap<Integer, List<Integer>> fMap = new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> ls = new ArrayList<>();
            int curr = lo+rz;
            if(fMap.containsKey(curr)){
                ls = fMap.get(curr);
            }
            ls.add(i);
            fMap.put(curr,ls);
            max = Math.max(curr,max);
            if(nums[i]==0) rz++;
            else lo--;
        }
        List<Integer> ls = new ArrayList<>();
        int curr = lo+rz;
        if(fMap.containsKey(curr)){
            ls = fMap.get(curr);
        }
        ls.add(n);
        fMap.put(curr,ls);
        max = Math.max(curr,max);
        return fMap.get(max);
    }
}
