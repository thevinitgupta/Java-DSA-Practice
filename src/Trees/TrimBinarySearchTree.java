package Trees;

public class TrimBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return removeNode(root,low,high);
    }
    private static TreeNode removeNode(TreeNode root,int low, int high){
        if(root==null) return null;
        if(root.val<low) return removeNode(root.right, low, high);
        else if(root.val>high) return removeNode(root.left, low, high);

        root.left = removeNode(root.left,low,high);
        root.right = removeNode(root.right, low, high);
        return root;
    }
}
