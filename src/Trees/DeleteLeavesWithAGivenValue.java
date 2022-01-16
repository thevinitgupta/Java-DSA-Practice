package Trees;

public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return removeTarget(root,target);
    }
    public static TreeNode removeTarget(TreeNode root,int t){
        if(root==null) return null;

        if(root.left==null && root.right==null) {
            if(root.val==t) return null;
            else return root;
        }

        root.left = removeTarget(root.left,t);
        root.right = removeTarget(root.right,t);

        if(root.left==null && root.right==null && root.val==t) {
            return null;
        }
        else return root;
    }
}
