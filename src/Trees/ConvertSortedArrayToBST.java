package Trees;

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }
    private static TreeNode createBST(int [] nums,int l,int r){
        if(l>r) return null;
        int mid = l + (r-l)/2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = createBST(nums,l,mid-1);
        curr.right = createBST(nums,mid+1,r);
        return curr;
        //return null;
    }
}
