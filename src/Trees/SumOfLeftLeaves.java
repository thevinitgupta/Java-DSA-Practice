package Trees;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sumL = getLeftLeaves(root.left,'l');
        int sumR = getLeftLeaves(root.right,'r');
        return sumL+sumR;
    }
    public static int getLeftLeaves(TreeNode root,char side){
        int sum =0;
        if(root==null) return sum;
        if(side=='l' && root.left==null && root.right==null) sum += root.val;
        sum += getLeftLeaves(root.left,'l');
        sum += getLeftLeaves(root.right,'r');
        return sum;
    }
}
