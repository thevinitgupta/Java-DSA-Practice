package Array;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int i = 0, j = 1, n = nums.length, max = 1;
        while(i<n && j<n){
            while(j<n && nums[j]>nums[j-1]){
                j++;
            }
            max = Math.max((j-i),max);
            i=j;
            j=i+1;
        }
        return max;
    }
}
