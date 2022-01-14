package Trees;

public class BSTToGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {
        getGst(root,0);
        return root;
    }

    public static TreeNode getGst(TreeNode root, int sum){
        if(root.left==null && root.right==null){
            root.val += sum;
            return root;
        }

        TreeNode temp = null;
        if(root.right!=null) root.val += getGst(root.right,sum).val;
        else root.val += sum;
        if(root.left!=null) temp = getGst(root.left,root.val);

        return temp==null ? root : temp;
    }
}
