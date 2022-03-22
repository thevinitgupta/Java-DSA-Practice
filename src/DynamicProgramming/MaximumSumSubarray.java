package DynamicProgramming;

public class MaximumSumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int [] dp = new int[n];
        dp[0] = nums[0];
        int m = getMax(nums, dp, nums[0], 1);
        //System.out.println(Arrays.toString(dp));
        return m;
    }
    public static int getMax(int [] nums, int [] dp, int max, int k){
        if(k>=nums.length) return max;
        dp[k] = Math.max(dp[k-1]+nums[k], nums[k]);
        max = Math.max(max, dp[k]);
        return getMax(nums, dp, max, k+1);
    }
}
