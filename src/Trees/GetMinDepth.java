package Trees;

public class GetMinDepth {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return getMinDepth(root,0);
    }
    public static int getMinDepth(TreeNode root,int curr){
        if(root==null) return curr;
        curr++;
        int lh = getMinDepth(root.left,curr);
        int rh = getMinDepth(root.right,curr);
        if(root.left==null) return rh;
        else if(root.right==null) return lh;
        return Math.min(lh,rh);
    }
}
