package Trees;

public class ConstructBTFromPostPre {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return getTree(preorder, postorder, 0, preorder.length-1, 0, postorder.length-1);
    }
    public static TreeNode getTree(int [] pre, int [] post, int prs, int pren, int pos, int posen){
        if(prs>pren || pos>posen) return null;
        TreeNode root = new TreeNode(pre[prs]);
        if(prs==pren) return root;
        int next = pre[prs+1];
        int idx = pos,count=1;
        for(;idx<=posen;idx++){
            if(post[idx]==next) break;
            count++;
        }
        root.left = getTree(pre,post,prs+1,prs+count,pos, idx);
        root.right = getTree(pre, post, prs+count+1, pren, idx+1, posen-1);
        return root;
    }
}
