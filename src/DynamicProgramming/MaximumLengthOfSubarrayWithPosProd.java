package DynamicProgramming;

public class MaximumLengthOfSubarrayWithPosProd {
    public int getMaxLen(int[] nums) {
        int llp = 0;
        int lln = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                llp = lln = 0;
            } else if (nums[i] > 0) {
                llp++;

                if (lln > 0) lln++;
            } else {

                int temp = llp;
                llp = (lln > 0 ? lln + 1 : 0);
                lln = temp + 1;
            }
            max = Math.max(max, llp);
        }
        return max;
    }
}
