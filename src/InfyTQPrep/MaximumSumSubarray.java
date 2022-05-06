package InfyTQPrep;

public class MaximumSumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int [] pre = new int[n];
        int max = nums[0];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = Math.max(pre[i-1]+nums[i], nums[i]);
            max = Math.max(max, pre[i]);
        }
        return max;
    }
}
