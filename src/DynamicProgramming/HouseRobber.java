package DynamicProgramming;

public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        dp[n-1] = nums[n-1];
        int k=0;
        while(k<n && nums[k]==0)k++;
        if(k==n) return 0;
        return Math.max(nums[0]+robb(nums,dp,2,nums.length-1), robb(nums,dp,1,nums.length-1));
    }
    public static int robb(int [] nums, int [] dp, int low, int high){
        if(low>high) return 0;
        if(dp[low]!=0) return dp[low];
        dp[low] = Math.max(nums[low] + robb(nums,dp, low+2,high), robb(nums, dp, low+1, high));
        return dp[low];
    }
}
