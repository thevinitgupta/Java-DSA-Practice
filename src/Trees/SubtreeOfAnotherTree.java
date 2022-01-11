package Trees;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        //if() return true;
        return isSame(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public static boolean isSame(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return true;
        else if(root1==null || root2==null) return false;

        if(root1.val==root2.val){
            return isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
        }
        else return false;
    }
}
