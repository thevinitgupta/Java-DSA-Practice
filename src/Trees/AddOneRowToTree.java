package Trees;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        return addRow(root,1,val,depth);
    }
    public static TreeNode addRow(TreeNode root, int curr, int val, int depth){
        if(root==null) return null;
        if(depth==1 && depth==curr) {
            TreeNode v = new TreeNode(val);
            v.left = root;
            return v;
        }
        else if(depth-1==curr) {
            TreeNode lt = new TreeNode(val);
            TreeNode rt = new TreeNode(val);
            lt.left = root.left;
            rt.right = root.right;
            root.left = lt;
            root.right = rt;
            return root;
        }
        curr++;
        root.left = addRow(root.left,curr,val,depth);
        root.right = addRow(root.right,curr,val,depth);
        return root;
    }
}
