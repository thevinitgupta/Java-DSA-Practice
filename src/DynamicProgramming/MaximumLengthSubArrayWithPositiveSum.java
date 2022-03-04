package DynamicProgramming;

public class MaximumLengthSubArrayWithPositiveSum {

    //TLE
    public int getMaxLen(int[] nums) {
        int prev = 0,n = nums.length,maxLen= 0;
        long prod = 1;
        if(n==1) {
            if(nums[0]>0) return 1;
            else return 0;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(i==prev){
                    prod = 1;
                    prev = i+1;
                    continue;
                }
                if(prod>0) maxLen = Math.max(maxLen,i-prev);
                else {
                    maxLen = Math.max(maxLen, getMax(nums,prod, prev, i-1));
                    prod = 1;
                }
                prev = i+1;
            }
            prod = nums[i]==0 ? 1 : (prod * nums[i]) % 1000000007;
        }
        maxLen = Math.max(maxLen,getMax(nums, prod, prev, n-1));
        return maxLen;
    }
    public static int getMax(int [] nums, long prod, int low, int high){
        if(low>=high) return 0;
        if(prod>0) return (high-low)+1;
        long pre = prod / nums[low];
        long post = prod / nums[high];
        if(pre>0 || post>0) return high-low;
        return Math.max(getMax(nums, pre, low+1, high), getMax(nums, post, low, high-1));
    }
}
