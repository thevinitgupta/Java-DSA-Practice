package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonDecreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int tot = 0;
        for(int i=0;i<nums.length;i++){
            tot += nums[i];
        }
        List<Integer> res = new ArrayList<>();
        int k = nums.length-1,subSum = 0;
        while(k>=0 && subSum<=tot){
            subSum += nums[k];
            tot -= nums[k];
            res.add(nums[k]);
            k--;
        }
        return res;
    }
}
