package Trees;

import java.util.LinkedList;
import java.util.Queue;

class PairN{
    TreeNode node;
    int idx;
    PairN(TreeNode node, int i){
        this.node = node;
        this.idx = i;
    }
}

public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<PairN> q = new LinkedList<>();
        q.offer(new PairN(root,0));
        int maxWidth = 1;
        while(!q.isEmpty()){
            int n = q.size();
            int min = q.peek().idx;
            int first = 0,last = 0;
            for(int i=0;i<n;i++){
                TreeNode front = q.peek().node;
                int ci = q.peek().idx - min;
                if(i==0) first = ci;
                if(i==n-1) last = ci;
                q.poll();
                if(front.left!=null) q.offer(new PairN(front.left, (ci*2) + 1));
                if(front.right!=null) q.offer(new PairN(front.right, (ci*2) + 2));
            }
            maxWidth = Math.max(maxWidth, (last-first)+1);
        }
        return maxWidth;
    }
}
