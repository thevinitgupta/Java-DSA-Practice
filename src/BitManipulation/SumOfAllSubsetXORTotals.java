package BitManipulation;

import java.util.ArrayList;

public class SumOfAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<Integer> xors = new ArrayList<>();
        xors.add(0);
        subsets.add(subset);
        getSubsets(nums, 0, subsets,xors);
        int sum = 0;
        for(int i=0;i<xors.size();i++){

            sum += xors.get(i);
        }
        return sum;
    }
    public static void getSubsets(int[] nums, int pos, ArrayList<ArrayList<Integer>> subsets,ArrayList<Integer> xors){
        if(pos>=nums.length) return;
        int n = subsets.size();
        for(int i=0;i<n;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            sub.addAll(subsets.get(i));
            sub.add(nums[pos]);
            xors.add(xors.get(i)^nums[pos]);
            subsets.add(sub);
        }
        getSubsets(nums,pos+1, subsets,xors);
    }
}
