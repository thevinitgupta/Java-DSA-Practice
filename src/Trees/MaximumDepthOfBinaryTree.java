package Trees;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return getDepth(root,0);
    }
    static int getDepth(TreeNode root, int curr){
        if(root==null) return curr;
        else {
            return Math.max(getDepth(root.left,curr+1),getDepth(root.right,curr+1));
        }
    }
}
