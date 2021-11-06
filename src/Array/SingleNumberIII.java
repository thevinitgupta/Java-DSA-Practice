package Array;
import java.util.HashMap;
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else {
                int c = map.get(nums[i]);
                map.put(nums[i],c+1);
            }
        }
        int [] once = new int[2];
        int k=0;
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        for(int i=0;i<keys.length;i++){
            if(map.get(keys[i])==1) {
                once[k++] = keys[i];
                if(k==2) break;
            }
        }
        return once;
    }
}
