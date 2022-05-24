package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumProblem {
    static Boolean isSubsetSum(int N, int arr[], int sum){
        List<Integer> sums = new ArrayList<>();
        List<List<Integer>> subsets = subsets(arr,sums);
        for(int i=0;i<sums.size();i++){
            if(sums.get(i)==sum) return true;
        }
        return false;
    }
    public static List<List<Integer>> subsets(int[] nums, List<Integer> sums) {
        List<List<Integer>> subs = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sums.add(0);
        subs.add(sub);
        return getSubsets(nums,subs,0,sums);
    }
    public static List<List<Integer>> getSubsets(int [] nums, List<List<Integer>> subs, int pos, List<Integer> sums){
        if(pos>=nums.length) return subs;
        List<List<Integer>> currSubs = new ArrayList<>();
        currSubs.addAll(subs);
        for(int i=0;i<subs.size();i++){
            List<Integer> sub = new ArrayList<>();

            sub.addAll(subs.get(i));
            int s = sums.get(i);
            sub.add(nums[pos]);
            s+= nums[pos];
            currSubs.add(sub);
            sums.add(s);

        }
        return getSubsets(nums, currSubs, pos+1,sums);
    }
}
