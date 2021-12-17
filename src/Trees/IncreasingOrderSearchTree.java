package Trees;

public class IncreasingOrderSearchTree {
    static TreeNode iHead,pointer;
    public TreeNode increasingBST(TreeNode root) {
        iHead = new TreeNode();
        pointer = iHead;
        addNodes(root);
        return iHead.right;
    }
    private static void addNodes(TreeNode root){
        if(root==null) return;
        //System.out.println(root.val);
        addNodes(root.left);
        root.left =null;
        pointer.right = root;
        pointer = root;
        addNodes(root.right);
        //System.out.println(pointer.val);
    }
}
