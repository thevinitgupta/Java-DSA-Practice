package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    static List<Integer> ino;
    public List<Integer> inorderTraversal(TreeNode root) {
        ino = new ArrayList<Integer>();
        getIno(root);
        return ino;
    }
    private static void getIno(TreeNode root){
        if(root==null) return;
        getIno(root.left);
        ino.add(root.val);
        getIno(root.right);
    }
}
