package InfyTQPrep;

public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length, sum=0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, currMax = 0, currMin = 0;

        for(int i=0;i<n;i++){
            currMax = currMax + nums[i];
            max = Math.max(currMax, max);

            currMin = currMin + nums[i];
            min = Math.min(currMin, min);

            sum += nums[i];

            if(currMin>0) currMin = 0;
            if(currMax<0) currMax = 0;
        }

        if(sum==min) return max;

        else return Math.max(max, sum-min);

    }
}
