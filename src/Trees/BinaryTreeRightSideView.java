package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> right = new ArrayList<>();
        getRightSide(root,right,0,0);
        return right;
    }
    public static void getRightSide(TreeNode root, List<Integer> right, int n, int row){
        if(root==null) return;
        row++;
        // System.out.println(row+", "+n);
        // System.out.println(root.val);
        if(row>n) {
            if(right.size()<=n)
                right.add(root.val);
            n++;
        }
        getRightSide(root.right,right,n,row);
        getRightSide(root.left,right,n,row);
        return;
    }
}
