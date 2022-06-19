package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;

public class CountNumberOfMaximumORSubset {
    public int countMaxOrSubsets(int[] nums) {
        int count = 0, max = Integer.MIN_VALUE;
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        subsets.add(subset);
        generate(nums,0,subsets);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<subsets.size();i++){
            ArrayList<Integer> sub = subsets.get(i);
            // System.out.println(sub);
            int xor = sub.size() > 0 ? sub.get(0) : 0;
            for(int j=1;j<sub.size();j++){
                xor |= sub.get(j);
            }
            // System.out.println(xor);
            map.put(xor, map.getOrDefault(xor,0)+1);
            max = Math.max(xor,max);
        }

        for(Integer key : map.keySet()){
            if(key==max) return map.get(key);
        }
        return -1;
    }
    public static void generate(int [] nums, int pos, ArrayList<ArrayList<Integer>> subsets){
        if(pos>=nums.length) return;
        int n = subsets.size();
        for(int i=0;i<n;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            sub.addAll(subsets.get(i));
            sub.add(nums[pos]);
            subsets.add(sub);
        }
        generate(nums,pos+1, subsets);
        return;
    }
}
