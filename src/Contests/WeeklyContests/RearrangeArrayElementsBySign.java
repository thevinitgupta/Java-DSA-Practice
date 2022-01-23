package Contests.WeeklyContests;

import java.util.Stack;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        //int i=0,j=1;
        int n = nums.length;
        // [3,4,-1,-3 ]
        //[-3,-5,-6,5,4,2]
        Stack<Integer> neg = new Stack<>();
        Stack<Integer> pos = new Stack<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos.push(nums[i]);
            else neg.push(nums[i]);
        }
        int k=n-1;
        while(k>0){
            nums[k] = neg.pop();
            nums[k-1] = pos.pop();
            k = k-2;
        }
        return nums;
    }
}
