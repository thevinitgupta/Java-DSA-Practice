package Array;

import java.util.Arrays;

/*
* You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.
* */
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int [] maxArr = new int[nums.length - k + 1];
        int currMax = nums[0],c=0,i=0,j=0;
        while(j<nums.length){
            System.out.println(nums[i]+""+nums[j]);
            currMax = Math.max(currMax,nums[j]);
            if((j-i)+1 >=k){
                int prevMax = c>0 ? maxArr[c-1] : currMax;
                maxArr[c] = Math.max(currMax,prevMax);
                c++;
                i++;
            }
            j++;
        }
        return maxArr;
    }

    public static void main(String[] args) {
        int [] nums = {1,-1};
        int [] max = maxSlidingWindow(nums,1);
        System.out.println("Max Array : "+ Arrays.toString(max));
    }
}
