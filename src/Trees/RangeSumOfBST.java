package Trees;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(root.val>high) return rangeSumBST(root.left,low,high);
        else if(root.val<low) return rangeSumBST(root.right,low,high);

        int sum = 0;
        return sum + root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
}
