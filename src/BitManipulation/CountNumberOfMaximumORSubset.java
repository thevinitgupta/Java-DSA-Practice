package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;

public class CountNumberOfMaximumORSubset {
    public int countMaxOrSubsetsFast(int[] nums) {

        subsets(nums, 0, 0);
        return count;
    }

    int count = 0;
    int maxOR = 0;

    private void subsets(int[] arr, int vidx, int OR){

        if(vidx == arr.length){

            if(OR == maxOR){
                count ++;
            }else if(OR > maxOR){
                count = 1;
                maxOR = OR;
            }

            return;
        }

        // include
        subsets(arr, vidx+1, OR | arr[vidx]);

        // exclude
        subsets(arr, vidx+1, OR);
    }
    public int countMaxOrSubsets(int[] nums) {
        int count = 0, max = Integer.MIN_VALUE;
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        subsets.add(subset);
        ArrayList<Integer> xors = new ArrayList<>();
        xors.add(0);
        max = generate(nums,0,subsets,xors, Integer.MIN_VALUE);


        for(Integer key : xors){
            if(key==max) count++;
        }
        return count;
    }
    public static int generate(int [] nums, int pos, ArrayList<ArrayList<Integer>> subsets,  ArrayList<Integer> xors, int max){
        if(pos>=nums.length) return max;
        int n = subsets.size();
        for(int i=0;i<n;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            sub.addAll(subsets.get(i));
            sub.add(nums[pos]);
            subsets.add(sub);
            int curr = xors.get(i)|nums[pos];
            xors.add(curr);
            max = Math.max(max, Math.max(curr, xors.get(i)));
        }
        return Math.max(max,generate(nums,pos+1, subsets,xors, max));
    }
}
