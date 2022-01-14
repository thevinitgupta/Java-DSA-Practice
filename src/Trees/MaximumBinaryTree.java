package Trees;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxBinTree(nums,0,nums.length);
    }
    public static TreeNode maxBinTree(int[]nums,int l,int r){
        if(l>=r) return null;
        int max = Integer.MIN_VALUE,maxInd = -1;
        for(int i=l;i<r;i++){
            if(nums[i]>max){
                max = nums[i];
                maxInd = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = maxBinTree(nums, l, maxInd);
        root.right = maxBinTree(nums, maxInd+1,r);
        return root;
    }
}
