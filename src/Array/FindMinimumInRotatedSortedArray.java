package Array;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int i=1,n = nums.length;
        while(i+1<n){
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]) {
                return nums[i];
            }
            i++;
        }
        return Math.min(nums[n-1],nums[0]);
    }
}
