package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        boolean ltr = true;
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = q.size();

            for(int i=0;i<n;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add( q.peek().right);
                if(ltr==true) level.add(q.remove().val);
                else level.add(0,q.remove().val);
            }
            ltr = !ltr;
            levels.add(level);
        }
        return levels;
    }
}
