package Trees;

public class BinaryTreePrunning {
    public TreeNode pruneTree(TreeNode root) {
        if(hasOne(root))
            return root;
        else return null;
    }
    public static boolean hasOne(TreeNode root){
        if(root==null) return true;

        if(hasOne(root.left)==false) root.left =null;
        if(hasOne(root.right)==false) root.right = null;
        if(root.left==null && root.right==null) {
            if(root.val==0) return false;
            else return true;
        }
        return true;
    }
}
