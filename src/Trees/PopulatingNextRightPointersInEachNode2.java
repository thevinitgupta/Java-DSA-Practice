package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode2 {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node front = q.peek();
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
                q.remove();
                if(i<n-1) front.next = q.peek();
            }
        }
        return root;
    }
}
