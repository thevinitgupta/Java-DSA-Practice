package Trees;
class TreeDepth{
    public TreeNode root1,root2;
    public int depth1,depth2;
    TreeDepth(){
        root1 = null;
        root2 = null;
        depth1 = -1;
        depth2 = -1;
    }
    public void setFirst(TreeNode r,int d){
        root1=r;
        depth1=d;
    }
    public void setSecond(TreeNode r,int d){
        root2 = r;
        depth2 = d;
    }
}
public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeDepth t = new TreeDepth();
        t = getDepths(root,x,y,0,t);
        if(t.root1==null || t.root2==null) return false;
        else if(t.depth1!=t.depth2) return false;
        else return true;
    }
    public static TreeDepth getDepths(TreeNode root, int x, int y,int currDepth, TreeDepth t){
        if(root==null) return t;

        if(root.left!=null && (root.left.val==x || root.left.val==y)){
            if(t.root1==null)
                t.setFirst(root,currDepth+1);
            else {
                t.setSecond(root,currDepth+1);
                return t;
            }
        }
        else if(root.right!=null && (root.right.val==x || root.right.val==y)){
            if(t.root1==null)
                t.setFirst(root,currDepth+1);
            else {
                t.setSecond(root,currDepth+1);
                return t;
            }
        }
        t = getDepths(root.left,x,y,currDepth+1,t);
        t = getDepths(root.right,x,y,currDepth+1,t);
        return t;
    }
}
