package Trees;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        else if(root.val==val) return root;

        TreeNode left = searchBST(root.left,val);
        if(left!=null) return left;
        TreeNode right = searchBST(root.right,val);
        if(right!=null) return right;

        return null;
    }
}
