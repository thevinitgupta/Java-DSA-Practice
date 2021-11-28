package Contests.WeeklyContests;
import java.util.*;
public class FindTargetIndicesAfterSorting {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> tars = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && nums[i]<=target){
            if(nums[i]==target) tars.add(i);
            i++;
        }
        return tars;
    }
}