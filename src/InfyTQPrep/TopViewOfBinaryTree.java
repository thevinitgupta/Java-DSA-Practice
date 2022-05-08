package InfyTQPrep;

import Trees.Node;
import java.util.*;

class NodePos{
    Node node;
    int hd ;
    NodePos(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

public class TopViewOfBinaryTree {
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<NodePos> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        ArrayList<Integer> top = new ArrayList<>();

        if(root==null) return top;

        q.add(new NodePos(root,0));
        int min = 0, max = 0;

        while(!q.isEmpty()){
            NodePos temp = q.poll();
            if(!map.containsKey(temp.hd)){
                map.put(temp.hd, temp.node);
            }

            if(temp.node.left!=null) {
                min = Math.min(min, temp.hd-1);
                q.add(new NodePos(temp.node.left, temp.hd - 1));
            }
            if(temp.node.right!=null) {
                max = Math.max(max, temp.hd+1);
                q.add(new NodePos(temp.node.right, temp.hd + 1));
            }
        }

        for(int i = min; i<=max; i++){
            if(map.containsKey(i)){
                top.add(map.get(i).data);
            }
        }

        return top;

    }
}
