package Trees;

public class LowestCommonAncestorOfDeepestLeaves {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int max = getMaxDepth(root,0,0);
        //System.out.println(max);
        return getLowest(root,max,0);
    }
    public static TreeNode getLowest(TreeNode root, int max,int curr){
        if(root==null) return null;
        curr++;
        if(root.left==null && root.right==null){
            if(curr==max) return root;
            else return null;
        }
        TreeNode lt = getLowest(root.left,max,curr);
        TreeNode rt = getLowest(root.right,max,curr);
        if(lt!=null && rt!=null) return root;
        else if(lt==null) return rt;
        else if(rt==null) return lt;
        else return null;
    }
    public static int getMaxDepth(TreeNode root,int prev,int curr){
        if(root==null) return prev;
        curr++;
        if(root.left==null && root.right==null) {
            if(curr>prev) return curr;
            else return prev;
        }
        prev = Math.max(prev, getMaxDepth(root.left,prev,curr));
        prev = Math.max(prev, getMaxDepth(root.right,prev,curr));

        return Math.max(curr,prev);
    }
}
