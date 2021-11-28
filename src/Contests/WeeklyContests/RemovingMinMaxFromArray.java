package Contests.WeeklyContests;

public class RemovingMinMaxFromArray {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int n = nums.length;
        int min = 0,max = n-1;
        int i=1,j=n-2;
        while(i<n && j>=0){
            if(nums[j]<nums[i]) {
                min = nums[j]<nums[min] ? j : min;
            }
            else {
                min = nums[i]<=nums[min] ? i : min;
            }


            if(nums[i]>nums[j]) {
                max = nums[i] >= nums[max] ? i : max;
            }
            else{
                max = nums[j] > nums[max] ? j : max;
            }
            i++;
            j--;
        }
        // int maxRight = n-max;
        // int minRight = n-min;
        min++;
        max++;
        int large = Math.max(min,max);
        int small = Math.min(min,max);


        int val = large;
        if(n-large+1 + small < val) val = small + n-large+1;
        if(n-small+1 < val) val = n-small+1;
        return val;
    }
}
