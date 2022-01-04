package Trees;

public class DiameterOfTree {

    // passed 100/104 test cases
    public int diameterOfBinaryTree(TreeNode root) {
        //System.out.println(getLeftHeight(root.left,0));
        //System.out.println(getRightHeight(root.right,0));
        return getMaxHeight(root,0)-1;
    }

    public static int getMaxHeight(TreeNode root,int max){
        if(root==null) return max;
        int lMax = getMaxHeight(root.left,max);
        int rMax = getMaxHeight(root.right,max);
        int lh = getHeight(root.left,0);
        int rh = getHeight(root.right,0);
        int curr = lh+rh+1;
        return Math.max(curr,max);
    }

    public static int getHeight(TreeNode root, int curr){
        if(root==null) return curr;
        curr++;
        int left = getHeight(root.left,curr);
        int right = getHeight(root.right,curr);
        int max = Math.max(left,right);
        return Math.max(curr,max);
    }
}
