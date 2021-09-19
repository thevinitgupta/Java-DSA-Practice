package Array;

/*
*
* Example 1:

Input: nums = [3,4,5,6,7,0,1], target = 0
Output: 4
*
* [0,1,2,4,5,6,7], [1,2,4,5,6,7,0],[4,5,6,7,0,1,2]
* */

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        System.out.println(Arrays.toString(nums));
        if(nums[0]>target){
            int j = nums.length-1;
            while(j>=0 && nums[j]>=target){
                if(nums[j]==target) return j;
                j--;
            }
        }
        else {
            int j = 0;
            while(j<nums.length && nums[j]<=target){
                if(nums[j]==target) return j;
                j++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,4,5,6,7,0};
        int ind = search(nums,0);
        System.out.println("0 found in "+ Arrays.toString(nums)+" at index = "+ind);
    }
}
