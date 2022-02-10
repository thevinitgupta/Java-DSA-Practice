package Array;

import java.util.Arrays;

public class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int i=0,j=1,count=0,n=nums.length, p1 = Integer.MAX_VALUE, p2 = Integer.MAX_VALUE;
        while(i<n){
            j = i+1;
            while(j<n){
                if(nums[j]-nums[i]==k){
                    if(nums[i]!=p1 && nums[j]!=p2){
                        count++;
                        p1 = nums[i];
                        p2 = nums[j];
                        break;
                    }
                }
                j++;
            }
            i++;
        }
        return count;
    }
}
