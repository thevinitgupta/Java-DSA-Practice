package Contests.WeeklyContests;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElements {
    //O(NlogN) solution
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int min = nums[0],max = nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>min && nums[i]<max) count++;
        }
        return count;
    }

//    O(N*N) solution
//    public int countElements(int[] nums) {
//        Arrays.sort(nums);
//        int count = 0;
//        for(int i=1;i<nums.length-1;i++){
//            boolean smaller = false,larger = false;
//            for(int j = 0;j<i;j++){
//                if(nums[j]<nums[i]) {
//                    smaller = true;
//                    break;
//                }
//            }
//            if(!smaller) continue;
//            for(int j = i+1;j<nums.length;j++){
//                if(nums[j]>nums[i]) {
//                    larger = true;
//                    break;
//                }
//            }
//            if(larger) count++;
//        }
//        return count;
//    }
}
