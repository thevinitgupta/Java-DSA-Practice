package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean even = true;
        while(!q.isEmpty()){
            int n = q.size();
            int prev = 0;
            for(int i=0;i<n;i++){
                TreeNode front = q.peek();
                if(even) {
                    if(front.val%2==0) return false;
                    if(prev!=0 && prev>=front.val) return false;
                }
                else {
                    if(front.val%2!=0) return false;
                    if(prev!=0 && prev<=front.val) return false;
                }

                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
                prev = front.val;
                q.remove();
            }
            even = !even;
        }
        return true;
    }
}
