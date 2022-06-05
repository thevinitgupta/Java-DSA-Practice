package Contests.WeeklyContests.Contest296;

import java.util.HashMap;

public class ReplaceElementsInAnArray {
    public int[] arrayChange(int[] nums, int[][] ops) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<ops.length;i++){
            int ind = map.get(ops[i][0]);
            nums[ind] = ops[i][1];
            map.put(nums[ind],ind);
        }
        return nums;
    }
}
