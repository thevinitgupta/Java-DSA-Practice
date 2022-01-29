package Trees;

public class LowestCommonAncestorOfBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return getLCA(root, p, q);
    }
    public static TreeNode getLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        //System.out.println(root.val);
        if(root==p || root==q) return root;

        TreeNode lt = getLCA(root.left,p,q);
        TreeNode rt = getLCA(root.right,p,q);
        if(lt==null && rt==null) return null;
        else if(lt==null) return rt;
        else if(rt==null) return lt;
        return root;
    }
}
