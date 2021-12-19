package Trees;

import java.util.HashMap;

public class TwoSum4 {
    static HashMap<Integer,Integer> bVals;
    public boolean findTarget(TreeNode root, int k) {
        bVals = new HashMap<>();
        return checkTarget(root,k);
    }
    private static boolean checkTarget(TreeNode root,int k){
        if(root==null) return false;
        if(bVals.containsKey(root.val)) return true;

        int t = k- root.val;
        bVals.put(t,root.val);
        return checkTarget(root.left,k) || checkTarget(root.right,k);
    }
}
