package InterviewBit.Arrays;

import java.util.List;

public class MaxSumSubarray {
    public int maxSubArray(final List<Integer> A) {
        int i=0,j=1, maxSum = A.get(0), currSum = A.get(0);
        while(i<A.size() && j<A.size()){
            currSum += A.get(j);
            if(A.get(j)>currSum) {
                currSum = A.get(j);
                i=j;
            }
            maxSum = Math.max(currSum, maxSum);
            j++;
        }
        return maxSum;
    }
}
