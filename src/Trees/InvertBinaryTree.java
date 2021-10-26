package Trees;

public class InvertBinaryTree {
    //faster than 100% in first attempt
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
}
