package Array;

public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]) return nums[i];
            i = i + 2;
        }
        return nums[i];
    }
}
