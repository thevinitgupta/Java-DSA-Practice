package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int [] multiples = new int[nums.length];
        multiples[0] = nums[0];
        int tot= 1;
        int zC = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                tot *= nums[i];
            }
            else zC++;
        }
        int [] res = new int[nums.length];
        if(zC>1) return res;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                if(zC==1)
                res[i] = 0;
                else res[i] = tot/nums[i];
            }
            else res[i] = tot;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {-1,2,0,3,-4,0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
