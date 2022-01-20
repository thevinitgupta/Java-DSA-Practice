package Trees;

import java.util.ArrayList;

public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> sorted = new ArrayList<>();
        sorted = inOrder(root,sorted);
        return sorted.get(k-1);
    }
    public static ArrayList<Integer> inOrder(TreeNode root,ArrayList<Integer> sorted){
        if(root==null) return sorted;
        sorted = inOrder(root.left,sorted);
        sorted.add(root.val);
        sorted = inOrder(root.right,sorted);
        return sorted;
    }
}
