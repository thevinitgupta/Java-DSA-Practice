package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTheDifferenceBetweenArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> pr1 = new HashMap<>();
        HashMap<Integer, Boolean> pr2 = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            pr1.put(nums1[i],true);
        }
        List<Integer> curr = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            pr2.put(nums2[i],true);
            if(!pr1.containsKey(nums2[i]) && !curr.contains(nums2[i])) {
                curr.add(nums2[i]);
            }
        }
        ans.add(curr);
        curr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            //pr2.put(nums1[i],true);
            if(!pr2.containsKey(nums1[i]) && !curr.contains(nums1[i])) {
                curr.add(nums1[i]);
            }
        }
        ans.add(0,curr);
        return ans;
    }
}
