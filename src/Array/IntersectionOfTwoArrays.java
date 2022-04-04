package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> inter = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i], true);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && !inter.contains(nums2[i])) inter.add(nums2[i]);

        }
        int [] ans = new int[inter.size()];
        for(int i=0;i<inter.size();i++){
            ans[i] = inter.get(i);
        }
        return ans;
    }
}
