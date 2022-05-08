package InfyTQPrep;

import Trees.Node;
import java.util.*;

class NodePos2 {
    Node node;
    int hd;
    NodePos2(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}


public class BottomViewOfBinaryTree {
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<NodePos2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        ArrayList<Integer> bottom = new ArrayList<>();
        if(root==null) return bottom;

        int min =0, max = 0;
        q.add(new NodePos2(root, 0));
        while(!q.isEmpty()){
            NodePos2 temp = q.poll();
            map.put(temp.hd, temp.node);
            if(temp.node.left!=null){
                min = Math.min(min, temp.hd-1);
                q.add(new NodePos2(temp.node.left, temp.hd-1));
            }
            if(temp.node.right!=null){
                max = Math.max(max, temp.hd+1);
                q.add(new NodePos2(temp.node.right, temp.hd+1));
            }
        }

        for(int i=min;i<=max;i++){
            if(map.containsKey(i)){
                bottom.add(map.get(i).data);
            }
        }
        return bottom;
    }
}
