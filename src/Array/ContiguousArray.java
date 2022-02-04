package Array;

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int i=0,currSum = 0;
        while(i<n){
            if(nums[i]==0) currSum -= 1;
            else currSum += 1;

            if(map.containsKey(currSum)) {
                maxLength = Math.max(maxLength, i - map.get(currSum));
            }
            else {
                map.put(currSum, i);
            }
            i++;
        }
        return maxLength;
    }
}
