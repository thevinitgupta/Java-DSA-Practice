package Trees;

public class MaxDiffBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return getMaxDiff(root,root.val,root.val);
    }
    public static int getMaxDiff(TreeNode root, int max, int min){
        if(root==null) return max-min;
        max = Math.max(root.val,max);
        min = Math.min(root.val,min);
        return Math.max(getMaxDiff(root.left,max,min), getMaxDiff(root.right,max,min));
    }
}
