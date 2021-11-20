package POTD;

import Trees.Node;

import java.util.*;

/*
*
*                   1
                 /    \
                2      9
               /      /  \
              4      5     7
            /   \         /  \
           8     19     20    11
          /     /  \
         30   40   50
*
* */
public class ValentineSum {
    static int sum_at_distK(Node root, int target, int k){
        Map<Node,Node> parentMap =  new HashMap<>();
        Node[] targetNode = {null};
        findTarget(target, root, null, targetNode, parentMap);

        Queue<Node> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        int sum = 0;
        q.offer(targetNode[0]);
        visited.add(targetNode[0].key);

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {

                Node n = q.poll();

                // System.out.println(n.data);

                sum += n.key;

                if(k > 0) {
                    if(n.left != null && !visited.contains(n.left.key)) {
                        q.offer(n.left);
                        visited.add(n.left.key);
                    }
                    if(n.right != null && !visited.contains(n.right.key)) {
                        q.offer(n.right);
                        visited.add(n.right.key);
                    }
                    Node par = parentMap.get(n);
                    if(par != null && !visited.contains(par.key)) {
                        q.offer(par);
                        visited.add(par.key);
                    }
                }
            }
            k--;
        }

        return sum;
    }

    static void findTarget(int target, Node root, Node parent, Node[] res, Map<Node, Node> map) {
        if(root == null) return;

        map.put(root,parent);
        if(root.key == target) {
            res[0] = root;
        }

        findTarget(target,root.left,root,res,map);
        findTarget(target,root.right,root,res,map);
    }

}
