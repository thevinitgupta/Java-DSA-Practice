package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* LeetCode Q-1630 Arithmetic Subarrays
*
* You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries, where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.

Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.



Example 1:

Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
Output: [true,false,true]
* */

public class ArithmeticSubarrays {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> isArithmetic = new ArrayList<Boolean>();
        for(int i=0;i<l.length;i++){
            int [] sub = Arrays.copyOfRange(nums,l[i],r[i]+1);
            isArithmetic.add(true);
            Arrays.sort(sub);
            System.out.println(Arrays.toString(sub));
            for(int j=2;j<sub.length;j++){
                if(sub[j]-sub[j-1]!= sub[j-1]-sub[j-2]){
                    isArithmetic.set(i,false);
                    break;
                }
            }
        }
        return isArithmetic;
    }

    public static void main(String[] args) {
        int [] nums = {4,6,5,9,3,7};
        int [] l = {0,0,2};
        int [] r = {2,3,5};
        List<Boolean> isArithmetic = checkArithmeticSubarrays(nums,l,r);
        System.out.println("Arithmetic SUb arrays result : ");
        for(int i=0;i<isArithmetic.size();i++){
            System.out.println(isArithmetic.get(i));
        }
    }
}
