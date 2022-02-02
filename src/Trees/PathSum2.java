package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> sums = new ArrayList<>();
        if(root==null) return sums;
        curr.add(root.val);
        int sum = root.val;
        if(sum==targetSum){
            if(root.left==null && root.right==null)
                sums.add(curr);
        }
        getSums(root.left,targetSum, sum, curr, sums);
        getSums(root.right,targetSum, sum, curr.subList(0,1), sums);
        return sums;
    }
    public static void getSums(TreeNode root, int tar, int sum, List<Integer> curr, List<List<Integer>> sums){
        if(root==null) return;
        sum += root.val;
        if(sum==tar) {
            if(root.left==null && root.right==null){
                List<Integer> li = new ArrayList<>();
                li.addAll(curr);
                li.add(root.val);
                sums.add(li);
                return;
            }
        }
        curr.add(root.val);
        int n = curr.size();
        getSums(root.left,tar, sum, curr,sums);
        getSums(root.right,tar, sum, curr.subList(0,n),sums);
        return;
    }
}
