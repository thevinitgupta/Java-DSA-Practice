package Array;

import java.util.Arrays;

/*
* Q-1877 Minimize Maximum Sum Array
*
* The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.

For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:

Each element of nums is in exactly one pair, and
The maximum pair sum is minimized.
* */
public class MinimizeMaximumSum {
    public static int minPairSum(int[] nums) {
        int max = 0;
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
        int i=0,j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            max = Math.max(sum,max);
            i++;
            j--;
        }
        return max;
    }
    public static int[] mergeSort(int [] nums){
        if(nums.length<=1){
            return nums;
        }
        int mid = nums.length/2;
        int [] left = Arrays.copyOfRange(nums,0,mid);
        int [] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge(mergeSort(left),mergeSort(right));
    }
    public static int[] merge(int []l,int []r){
        int [] merged = new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<r[j]){
                merged[k] = l[i];
                i++;
            }
            else {
                merged[k] = r[j];
                j++;
            }
            k++;
        }
        while(i<l.length){
            merged[k] = l[i];
            i++;
            k++;
        }
        while(j<r.length){
            merged[k] = r[j];
            j++;
            k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,4,2,4,6};
        int maxSum = minPairSum(nums);
        System.out.println("Minimized Maximum Sum of Array : "+maxSum);
    }
}
