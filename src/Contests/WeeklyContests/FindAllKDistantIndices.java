package Contests.WeeklyContests;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndices {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keys = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key) keys.add(i);
        }
        int l=0;
        //System.out.println(keys);
        for(int i=0;i<nums.length;i++){
            if(l<keys.size()){
                //System.out.print(l+", ");
                int curr = Math.abs(i-keys.get(l)), next = k+1;
                if(l+1<keys.size()) next = Math.abs(i-keys.get(l+1));
                if(curr<=k || next<=k) {
                    indices.add(i);
                    if(next<curr) l++;
                }
                //System.out.println(l);
            }
        }
        return indices;
    }
}
