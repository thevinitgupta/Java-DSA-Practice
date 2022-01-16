package Trees;

import java.util.ArrayList;

public class BalanceABinarySearchTree {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> sorted = new ArrayList<>();
        sorted = getInorder(root,sorted);
        // System.out.println(sorted);
        return createBST(sorted,0,sorted.size());
    }
    public static TreeNode createBST(ArrayList<Integer> sorted,int l,int r){
        if(l>=r) return null;
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(sorted.get(mid));
        root.left = createBST(sorted,l,mid);
        root.right = createBST(sorted,mid+1,r);
        return root;
    }

    public static ArrayList getInorder(TreeNode root, ArrayList<Integer> sorted){
        if(root==null) return sorted;
        sorted = getInorder(root.left,sorted);
        sorted.add(root.val);
        sorted = getInorder(root.right,sorted);
        return sorted;
    }
}
