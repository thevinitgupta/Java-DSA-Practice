package Trees;

public class ConstructBSTFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return getBst(preorder,0,preorder.length);
    }
    public static TreeNode getBst(int[] pre,int l,int r){
        if(l>=r) return null;
        TreeNode root = new TreeNode(pre[l]);
        int i=l+1;
        while(i<r && pre[i]<pre[l]){
            i++;
        }
        root.left = getBst(pre,l+1,i);
        root.right = getBst(pre,i,r);
        return root;
    }
}
