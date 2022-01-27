package Trees;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        flattenToLL(root);
    }
    public static TreeNode flattenToLL(TreeNode root){
        if(root==null) return null;
        TreeNode left = flattenToLL(root.left);
        TreeNode right = root.right;
        if(left!=null) {
            root.right= left;
            root.left = null;
            while(left.right!=null) left = left.right;
            left.right = flattenToLL(right);
        }
        else root.right = flattenToLL(right);
        return root;
    }
}
