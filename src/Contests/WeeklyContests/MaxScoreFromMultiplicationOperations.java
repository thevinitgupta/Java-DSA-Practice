package Contests.WeeklyContests;

public class MaxScoreFromMultiplicationOperations {
    public int maximumScore(int[] nums, int[] mult) {
        int n = nums.length, m = mult.length, sum =0;
        int low = 0, high = n-1;
        return getProd(nums,mult,0,low,high,new int[m][m]);
    }
    public static int getProd(int []nums, int [] mult, int midx, int low, int high,int [][] dp){
        if(midx>=mult.length) return 0;
        if(dp[midx][low]!=0) return dp[midx][low];
        int lm = nums[low]*mult[midx] + getProd(nums,mult,midx+1,low+1,high,dp);
        int rm = nums[high]*mult[midx] + getProd(nums,mult,midx+1,low,high-1,dp);
        dp[midx][low] = Math.max(lm,rm);
        return dp[midx][low];
    }
}
