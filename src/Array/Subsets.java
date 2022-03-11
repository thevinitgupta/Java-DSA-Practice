package Array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subs = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        subs.add(sub);
        return generate(nums,subs,nums.length-1);
    }
    public static List<List<Integer>> generate(int [] nums, List<List<Integer>> subs, int k){
        if(k<0) return subs;
        List<List<Integer>> curr = new ArrayList<>();
        for(int i=0;i<subs.size();i++){
            List<Integer> n = new ArrayList<>();
            for(int j=0;j<subs.get(i).size();j++){
                n.add(subs.get(i).get(j));
            }
            n.add(nums[k]);
            curr.add(n);
            curr.add(subs.get(i));
        }
        return generate(nums, curr,k-1);
    }
}
