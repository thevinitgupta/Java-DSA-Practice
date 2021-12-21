package Trees;

public class DeepestLeavesSum {
    static int leafSum,maxDepth;
    public int deepestLeavesSum(TreeNode root) {
        leafSum = 0;
        maxDepth=0;
        getLeafSum(root,0);
        return leafSum;
    }
    private static void getLeafSum(TreeNode root,int level){
        if(root==null) return;
        else if(root.left==null && root.right==null){
            if(level>maxDepth){
                maxDepth = level;
                leafSum = root.val;
                return;
            }
            else if(level==maxDepth){
                leafSum += root.val;
                return;
            }
        }
        getLeafSum(root.left,level+1);
        getLeafSum(root.right,level+1);
    }
}
