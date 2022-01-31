package Trees;

public class ConstructBTFromInPost {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return getTree(inorder, postorder, 0, inorder.length-1,0,postorder.length-1);
    }
    public static TreeNode getTree(int [] in, int [] post, int ins, int inen, int pos, int pen){
        if(ins>inen || pos>pen) return null;
        TreeNode root = new TreeNode(post[pen]);
        //System.out.println(post[pen]);
        if(ins==inen) return root;
        int idx = ins,count=0;
        while(idx<=inen){
            if(in[idx]==post[pen]) break;
            count++;
            idx++;
        }
        root.left = getTree(in,post,ins,idx-1,pos, pos+count-1);
        root.right = getTree(in,post, idx+1,inen, pos+count, pen-1);
        return root;
    }
}
