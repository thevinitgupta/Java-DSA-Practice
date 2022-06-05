package Contests.WeeklyContests.Contest296;

public class MinMaxGame {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        int [] newNums = new int[nums.length/2];
        for(int i=0;i<newNums.length;i++){
            if(i%2==0) newNums[i] = Math.min(nums[i*2], nums[i*2+1]);
            else newNums[i] = Math.max(nums[i*2], nums[i*2+1]);
        }

        return minMaxGame(newNums);
    }
}
