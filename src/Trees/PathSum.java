package Trees;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return calcSum(root,0,targetSum);
    }
    public static boolean calcSum(TreeNode root,int prev,int target){
        if(root==null) return false;
        int curr = prev+root.val;
        if(root.left==null && root.right==null){
            if(curr==target) return true;
            else return false;
        }
        //else if(curr>=target) return false;
        return calcSum(root.left,curr,target) || calcSum(root.right,curr,target);
    }
}
