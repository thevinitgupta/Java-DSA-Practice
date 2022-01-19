package Trees;

import java.util.ArrayList;

public class MaximumLevelSumofBT {
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> levSum = new ArrayList<>();
        levSum = getLevSum(root,0,levSum);
        int max = 0;
        for(int i=1;i<levSum.size();i++){
            if(levSum.get(i)>levSum.get(max)) max = i;
        }
        return max+1;
    }
    public static ArrayList<Integer> getLevSum(TreeNode root, int curr,ArrayList<Integer> sums){
        if(root==null) return sums;
        if(curr<sums.size()){
            int s = sums.get(curr);
            sums.set(curr,s+root.val);
        }
        else sums.add(root.val);
        curr++;
        sums = getLevSum(root.left,curr,sums);
        sums = getLevSum(root.right,curr,sums);
        return sums;
    }
}
