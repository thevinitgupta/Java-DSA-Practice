package InfyTQPrep;

import Trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextPointersInEachNode {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node prev = null;
            int n = q.size();
            for(int i=0;i<n;i++){
                Node curr = q.peek();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                if(prev!=null) prev.next = curr;
                prev = curr;
                q.remove();
            }
        }
        return root;
    }
}
