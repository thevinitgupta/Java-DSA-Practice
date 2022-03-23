package Array;

public class MaximumSubarraySumCircular {
    public int maxSubarraySumCircular(int[] nums) {
        int tot = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, tempMax = 0, tempMin = 0, n = nums.length;
        for(int i=0;i<n;i++){
            tempMax += nums[i];
            maxSum = Math.max(maxSum, tempMax);
            tempMin += nums[i];
            minSum = Math.min(minSum, tempMin);
            tot+= nums[i];
            tempMax = tempMax<0 ? 0 : tempMax;
            tempMin = tempMin>0 ? 0 : tempMin;
        }

        if(tot==minSum) return maxSum;
        return Math.max(maxSum, tot-minSum);
    }
}
