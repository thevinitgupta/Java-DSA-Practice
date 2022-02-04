package Trees;

public class DeleteNodeFromBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        return delNode(root,key);
    }
    public static TreeNode delNode(TreeNode root, int key){
        if(root==null) return null;
        if(root.val==key){
            TreeNode rMost = getRight(root.left,root.right);
            return rMost;
        }
        root.left = delNode(root.left, key);
        root.right = delNode(root.right,key);
        return root;
    }
    public static TreeNode getRight(TreeNode root,TreeNode right){
        if(root==null) return right;
        root.right = getRight(root.right,right);
        return root;
    }
}
