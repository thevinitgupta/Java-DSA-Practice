package Trees;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        return isUniVal(root,root.val);
    }
    private static boolean isUniVal(TreeNode root, int val){
        if(root==null) return true;
        else if(root.val!=val) return false;
        else {
            return isUniVal(root.left,val) && isUniVal(root.right,val);
        }
    }
}
