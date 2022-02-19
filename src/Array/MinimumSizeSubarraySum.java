package Array;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum = 0,n = nums.length, len = n,count=0;
        while(i<=j && j<n){
            sum += nums[j];
            while(sum>=target){
                len = Math.min((j-i)+1, len);
                sum -= nums[i];
                i++;
                count++;
            }
            j++;
        }
        if(count==0) return 0;
        return len;
    }
}
