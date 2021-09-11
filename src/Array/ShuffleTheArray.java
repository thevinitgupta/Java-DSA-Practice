package Array;

import java.util.Arrays;

/*
* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*
* */
public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int i=0,j=n,c=0;
        int [] ans = new int[2*n];
        while(i<n && j<2*n){
            ans[c] = nums[i];
            ans[c+1] = nums[j];
            c = c+2;
            i++; j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int [] ans = shuffle(nums,3);
        System.out.println(Arrays.toString(ans));
    }
}
