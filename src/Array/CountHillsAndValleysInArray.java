package Array;

public class CountHillsAndValleysInArray {
    public int countHillValley(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1]) continue;
            int left = i-1, right = i+1;
            while(left>=0 && nums[i]==nums[left]) left--;
            while(right<nums.length && nums[i]==nums[right]) right++;
            if(left<0 || right>=nums.length) continue;

            if(nums[left]<nums[i] && nums[right]<nums[i]) {
                //System.out.println(nums[i]+" => hill");
                count++;
            }
            else if(nums[left]>nums[i] && nums[right]>nums[i]) {
                //System.out.println(nums[i]+" => valley");
                count++;
            }
        }
        return count;
    }
}
