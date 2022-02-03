package Trees;

public class ConstructBinaryTreeFromPreorderInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return getTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }
    public static TreeNode getTree(int [] pre, int [] in, int prs,  int pren, int ins, int inen){
        if(prs>pren || ins>inen) return null;
        TreeNode root = new TreeNode(pre[prs]);
        int idx = ins,count=0;
        while(idx<=inen){
            if(in[idx]==root.val) break;
            idx++;
            count++;
        }
        root.left = getTree(pre,in, prs+1, prs+count, ins, idx-1);
        root.right = getTree(pre,in, prs+count+1, pren, idx+1, inen);
        return root;
    }
}
