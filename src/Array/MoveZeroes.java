package Array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int start = 0;
        while(start<nums.length && nums[start]!=0) start++;
        for(int i=start+1;i<nums.length;i++){

            if(nums[i]!=0){
                nums[start] = nums[i];
                nums[i] = 0;
                start++;
            }
        }
    }
}
