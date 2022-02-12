package Trees;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inord = new ArrayList<>();
        return inorder(root,inord);
    }
    public static boolean inorder(TreeNode root, List<Integer> inord){
        if(root==null) return true;
        boolean lt = inorder(root.left,inord);
        if(!lt) return false;
        int n = inord.size();
        if(n>=1 && root.val<=inord.get(n-1)) return false;
        inord.add(root.val);
        return inorder(root.right, inord);
    }
}
