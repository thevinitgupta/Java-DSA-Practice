package Array;

import java.util.Arrays;

public class ReductionOperationsToMakeArrayEqual {
    public int reductionOperations(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        Arrays.sort(nums);
        int i=n-2,j=n-1;
        int count = 0;
        int min =nums[0];
        while(i>=0){
            if(nums[j]==min) break;
            while(i>=0 && nums[i]==nums[j])
            {
                j--;
                i--;
            }
            count += n-j;
            j=i;
            i--;
        }
        return count;
    }
}
