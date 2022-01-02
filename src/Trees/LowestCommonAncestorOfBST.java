package Trees;

public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return getLCA(root,p.val,q.val);
    }
    public static TreeNode getLCA(TreeNode root, int p, int q){
        if(root==null) return null;
        else if(root.val==p || root.val==q) return root;
        //TreeNode ls,rs;
        if(root.val<p && root.val<q){
            return getLCA(root.right,p,q);
        }
        else if(root.val>p && root.val>q){
            return getLCA(root.left,p,q);
        }

        TreeNode ls = getLCA(root.left,p,q);
        TreeNode rs = getLCA(root.right,p,q);
        if(ls==null) return rs;
        else if(rs==null) return ls;
        else return root;
    }
}
