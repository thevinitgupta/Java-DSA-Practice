package Trees;

public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return getSums(root,0);
    }
    public static int getSums(TreeNode root, int prev){
        if(root==null) return 0;
        int curr = prev*10 + root.val;
        if(root.left==null && root.right==null) return curr;
        int ls = getSums(root.left,curr);
        int rs = getSums(root.right,curr);
        return ls+rs;
    }
}
