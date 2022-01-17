package Trees;

public class CountGoodNodesInBT {
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        return countGood(root,root.val);
    }
    public static int countGood(TreeNode root, int max){
        if(root==null) return 0;
        int count = 0;
        if(root.val>=max) {
            count++;
            max = root.val;
        }
        count += countGood(root.left,max);
        count += countGood(root.right,max);
        return count;
    }
}
