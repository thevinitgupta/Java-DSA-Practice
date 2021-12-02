package POTD;

public class MaximumProductSubarray {
    long maxProduct(int[] nums, int n) {
        // code here
        long product = 1;
        long maxProduct = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            product *=nums[i];
            maxProduct = Math.max(maxProduct,product);
            if(product == 0){
                product = 1;
            }
        }
        product = 1;
        for(int i= nums.length-1;i>=0;i--){
            product *=nums[i];
            maxProduct = Math.max(maxProduct,product);
            if(product == 0){
                product = 1;
            }
        }
        return maxProduct;
    }
}
