package DynamicProgramming;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currMin =1, currMax = 1;
        for(int val : nums){
            if(val==0) {
                currMin = 1;
                currMax = 1;
            }
            int tempMin = currMin*val;
            currMin = Math.min(val, Math.min(tempMin, currMax*val));
            currMax = Math.max(val, Math.max(tempMin, currMax*val));
            max = Math.max(max, Math.max(currMin, currMax));
        }
        return max;
    }
}
