package Trees;

public class FindBottomLeftTreeValue {
    static int maxD, val;
    public int findBottomLeftValue(TreeNode root) {
        maxD=0;val=0;
        getMaxDepth(root,0);

        return val;
    }

    public static void getMaxDepth(TreeNode root,int row){
        if(root==null) return;
        row++;
        if(row>maxD) {
            maxD = row;
            val = root.val;
        }

        getMaxDepth(root.left,row);
        getMaxDepth(root.right,row);
        return;
    }
}
