package Array;

public class FindFirstAndLastElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int [] inds = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                inds[0] = Math.min(inds[0],i);
                inds[1] = Math.max(inds[1],i);
                found = true;
            }
        }
        if(!found) return new int[]{-1,-1};
        return inds;
    }
}
