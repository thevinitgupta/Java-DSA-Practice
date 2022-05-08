package InfyTQPrep;

import Trees.TreeNode;

public class InsertionAndDeletionInBST {

    //insertion
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);

        if(val<root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }

    //deletion
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val==key) {
            return replace(root.left, root.right);
        }
        else if(key<root.val){
            root.left = deleteNode(root.left,key);
        }
        else root.right = deleteNode(root.right,key);
        return root;
    }

    public static TreeNode replace(TreeNode left, TreeNode right){
        if(left==null) return right;
        else if(right==null) return left;
        TreeNode r = rightMost(left);
        r.right = right;
        return left;
    }

    public static TreeNode rightMost(TreeNode root){
        if(root.right==null) return root;
        else return rightMost(root.right);
    }
}
