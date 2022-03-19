package DynamicProgramming;

public class HouseRobber2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int i=0;
        while(i<n && nums[i]==0) i++;
        if(i==n) return 0;
        int [] dpf = new int[n];
        int [] dpl = new int[n];
        dpl[n-1] = nums[n-1];
        dpf[n-2] = nums[n-2];
        return Math.max(robb(nums, 0,n-2, dpf), robb(nums, 1,n-1, dpl));
    }
    public static int robb(int [] nums, int low, int high, int [] dp){
        if(low>high) return 0;
        if(dp[low]!=0) return dp[low];
        dp[low] = Math.max(robb(nums, low+1,high, dp), nums[low]+robb(nums, low+2,high, dp));
        return dp[low];
    }
}
