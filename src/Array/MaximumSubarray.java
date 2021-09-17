package Array;

/*
* Leetcode Q-53 Maximum SubArray
*
* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
* */

import java.util.Arrays;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max  = Integer.MIN_VALUE,currSum = 0;
        for(int i = 0;i<nums.length;i++){
            System.out.println("Element :"+nums[i]);
            if(nums[i]+currSum > nums[i]){
                System.out.println("element<currSum : reset currSum");
                currSum += nums[i];
            }
            else {
                currSum = nums[i];
            }
            if(currSum>max){
                System.out.println("currSum>max");
                max = currSum;
                System.out.println("max : "+max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums = {-2,-3,-1,-5};
        int maxSum = maxSubArray(nums);
        System.out.println("Max Sum of Sub Array in "+ Arrays.toString(nums)+" is : "+maxSum);
    }
}

