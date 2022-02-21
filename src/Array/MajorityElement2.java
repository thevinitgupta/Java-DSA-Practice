package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> els = new ArrayList<>();
        Arrays.sort(nums);
        int i=0, j=0,n = nums.length;
        while(i<n && j<n){
            int c = 0;
            while(j<n && nums[i]==nums[j]) {
                j++;
                c++;
            }
            if(c > n/3) els.add(nums[i]);
            i = j;
            j=i;
        }
        return els;
    }
}
