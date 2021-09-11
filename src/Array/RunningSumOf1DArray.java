package Array;

import java.util.Arrays;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.*/
public class RunningSumOf1DArray {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {2,4,1,7,10,3};
        System.out.println("Original :");
        System.out.println(Arrays.toString(nums));
        nums = runningSum(nums);
        System.out.println("Running Sum Array : ");
        System.out.println(Arrays.toString(nums));
    }
}
