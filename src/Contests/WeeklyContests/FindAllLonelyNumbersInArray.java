package Contests.WeeklyContests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllLonelyNumbersInArray {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int i=0,j=1;
        int n = nums.length;
        if(n==1) {
            res.add(nums[0]);
            return res;
        }
        while(i<n-1){
            if(nums[i+1] - nums[i] > 1) {
                if(i==0) res.add(nums[i]);
                else {
                    if(nums[i]-nums[i-1] > 1) res.add(nums[i]);
                }
            }
            i++;
        }
        if(nums[i]-nums[i-1] > 1) res.add(nums[i]);
        return res;
    }
}
