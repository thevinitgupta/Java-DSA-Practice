package DynamicProgramming;

public class MaximumLengthSubArrayWithPositiveSum {

    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        if (nums[0] > 0) pos[0] = 1;
        if (nums[0] < 0) neg[0] = 1;
        int ans = pos[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                pos[i] = 1 + pos[i - 1];
                neg[i] = neg[i - 1] > 0 ? 1 + neg[i - 1]:0;
            } else if (nums[i] < 0) {
                pos[i] = neg[i - 1] > 0 ? 1 + neg[i - 1]:0;
                neg[i] = 1 + pos[i - 1];
            }
            ans = Math.max(ans, pos[i]);
        }
        return ans;
    }

    //TLE
//    public int getMaxLen(int[] nums) {
//        int prev = 0,n = nums.length,maxLen= 0;
//        long prod = 1;
//        if(n==1) {
//            if(nums[0]>0) return 1;
//            else return 0;
//        }
//        for(int i=0;i<n;i++){
//            if(nums[i]==0){
//                if(i==prev){
//                    prod = 1;
//                    prev = i+1;
//                    continue;
//                }
//                if(prod>0) maxLen = Math.max(maxLen,i-prev);
//                else {
//                    maxLen = Math.max(maxLen, getMax(nums,prod, prev, i-1));
//                    prod = 1;
//                }
//                prev = i+1;
//            }
//            prod = nums[i]==0 ? 1 : (prod * nums[i]) % 1000000007;
//        }
//        if(prod<0)
//        maxLen = Math.max(maxLen,getMax(nums, prod, prev, n-1));
//        else maxLen = Math.max(maxLen, n-prev);
//        return maxLen;
//    }
//    public static int getMax(int [] nums, long prod, int low, int high){
//        if(low>=high) return 0;
//        if(prod>0) return (high-low)+1;
//        long pre = prod / nums[low];
//        long post = prod / nums[high];
//        if(pre>0 || post>0) return high-low;
//        return Math.max(getMax(nums, pre, low+1, high), getMax(nums, post, low, high-1));
//    }
}
