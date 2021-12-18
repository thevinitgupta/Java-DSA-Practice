package Trees;

import java.util.ArrayList;

public class LeafSimilarTrees {
    static ArrayList<Integer> l1,l2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
        getLeaves(root1,1);
        getLeaves(root2,2);
        int i=0,n=l1.size();
        if(l2.size()!=n) return false;
        while(i<n){
            if(l1.get(i)!=l2.get(i)) return false;
            i++;
        }
        return true;
    }
    private static void getLeaves(TreeNode root,int t){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            if(t==1) l1.add(root.val);
            else l2.add(root.val);
            return;
        }

        getLeaves(root.left,t);
        getLeaves(root.right,t);
    }
}
