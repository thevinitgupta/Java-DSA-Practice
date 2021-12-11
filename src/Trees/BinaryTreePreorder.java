package Trees;

import java.util.*;

public class BinaryTreePreorder {
    static List<Integer> pre;
    public List<Integer> preorderTraversal(TreeNode root) {
        pre = new ArrayList<Integer>();
        getPre(root);
        return pre;
    }
    private static void getPre(TreeNode root){
        if(root==null) return;
        pre.add(root.val);
        getPre(root.left);
        getPre(root.right);
    }
}
