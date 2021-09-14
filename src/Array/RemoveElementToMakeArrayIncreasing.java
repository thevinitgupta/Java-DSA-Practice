package Array;
/*
* Leetcode Q-1909 Remove Element to Make Array Increasing
*  Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
* */
public class RemoveElementToMakeArrayIncreasing {
    public static boolean canBeIncreasing(int[] nums) {
        int prevLargest = nums[0],count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[prevLargest]){
                prevLargest = i;
            }
            else if(count==1 && nums[i]>nums[prevLargest-1]){
                prevLargest = i;
                count++;
            }
            else count++;
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,10,5,6,9};
        boolean canBeIncreasing = canBeIncreasing(nums);
        System.out.println("Can be made increasing ->"+canBeIncreasing);
    }
}
