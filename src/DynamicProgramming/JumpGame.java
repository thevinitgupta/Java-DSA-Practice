package DynamicProgramming;

public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean [] dp = new boolean[nums.length];
        dp[nums.length-1] = true;
        dp = possible(nums, dp, nums.length-1);
        return dp[0];
    }
    public static boolean [] possible(int [] nums, boolean [] dp, int k){
        if(k<0) return dp;
        int ladder = nums[k], pos = k,steps = 1;
        while(steps<=ladder){
            if(pos+steps<nums.length && dp[pos+steps] == true) {
                dp[pos] = true;
                return possible(nums,dp,k-1);
            }
            steps++;
        }
        return possible(nums,dp,k-1);
    }
}
