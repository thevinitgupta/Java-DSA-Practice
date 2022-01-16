package Trees;

public class InsertIntoABST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertNode(root,val);
    }
    public static TreeNode insertNode(TreeNode root,int val){
        if(root==null) return new TreeNode(val);

        if(root.val>val){
            if(root.left==null) {
                root.left = new TreeNode(val);
                return root;
            }
            else root.left =  insertNode(root.left,val);
        }
        else if(root.val<val){
            if(root.right==null) {
                root.right = new TreeNode(val);
                return root;
            }
            else root.right = insertNode(root.right,val);
        }
        return root;
    }
}
