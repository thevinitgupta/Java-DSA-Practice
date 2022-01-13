package Trees;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root);
    }
    public static boolean checkHeight(TreeNode root){
        if(root==null) return true;
        int leftHeight = getHeight(root.left,1);
        int rightHeight = getHeight(root.right,1);
        int diff = Math.abs(leftHeight-rightHeight);
        if(diff>1) return false;

        return  checkHeight(root.left) && checkHeight(root.right);
    }
    public static int getHeight(TreeNode root,int curr){
        if(root==null) return curr;
        curr++;
        int lh = getHeight(root.left,curr);
        int rh = getHeight(root.right,curr);
        return Math.max(lh,rh);
    }
}
