package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PopulatingNextRightInEachNode {
    public Node connect(Node root) {
        HashMap<Integer, List<Node>> fMap = new HashMap<>();
        //System.out.println(root.next);
        populateNext(root,fMap,1);
        return root;
    }
    public void populateNext(Node root, HashMap<Integer,List<Node>> fMap, int level){
        if(root==null) return;
        List<Node> curr = new ArrayList<>();
        if(!fMap.containsKey(level)) {
            //root.next = null;
            curr.add(root);
        }
        else {
            curr = fMap.get(level);
            root.next = curr.get(0);
            curr.add(0,root);
        }
        fMap.put(level,curr);
        level++;
        populateNext(root.right,fMap,level);
        populateNext(root.left,fMap,level);
        return;
    }
}
