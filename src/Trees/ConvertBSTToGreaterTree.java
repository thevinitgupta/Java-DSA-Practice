package Trees;

public class ConvertBSTToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        createBST(root,0);
        return root;
    }
    public static int createBST(TreeNode root,int prev){
        if(root==null) return prev;
        int t = createBST(root.right,prev);
        prev = root.val+t;
        int temp = createBST(root.left,prev);
        root.val = prev;
        return temp;
    }
}
