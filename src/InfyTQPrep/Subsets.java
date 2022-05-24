package InfyTQPrep;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subs = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        subs.add(sub);
        return getSubsets(nums,subs,0);
    }
    public static List<List<Integer>> getSubsets(int [] nums, List<List<Integer>> subs, int pos){
        if(pos>=nums.length) return subs;
        List<List<Integer>> currSubs = new ArrayList<>();
        currSubs.addAll(subs);
        for(int i=0;i<subs.size();i++){
            List<Integer> sub = new ArrayList<>();

            sub.addAll(subs.get(i));
            sub.add(nums[pos]);
            currSubs.add(sub);

        }
        return getSubsets(nums, currSubs, pos+1);
    }
}
