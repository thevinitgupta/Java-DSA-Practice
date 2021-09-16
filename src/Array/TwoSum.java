package Array;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] sum2 = new int[2];
        for(int i=0;i<nums.length-1;i++){
            sum2[0] = i;
            int toFind = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == toFind){
                    sum2[1] = j;
                    return sum2;
                }
            }
        }
        return sum2;
    }

    public static void main(String[] args) {
        int [] nums = {2,1,7,3,11,9};
        int [] sol = twoSum(nums,9);
        System.out.println("For target 9, 2 sum indices array : "+Arrays.toString(sol));
    }
}
