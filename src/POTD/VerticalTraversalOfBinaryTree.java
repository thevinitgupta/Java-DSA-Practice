package POTD;

import LinkedLists.Node;

import java.util.*;

public class VerticalTraversalOfBinaryTree {
    //working solution with Queue
    static ArrayList<Integer> verticalOrder(Node root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> levelNodeMap = new HashMap<>();
        Queue<Integer> levels = new LinkedList<Integer>();

        queue.offer(root);
        levels.offer(0);
        Integer minLevel=0;
        Integer maxLevel=0;

        while(!queue.isEmpty()){
            Node node = queue.poll();
            Integer level = levels.poll();
            minLevel = Math.min(level, minLevel);
            maxLevel = Math.max(maxLevel, level);

            if(!levelNodeMap.containsKey(level)){
                levelNodeMap.put(level, new ArrayList<Integer>());
            }
            levelNodeMap.get(level).add(node.data);
            if(node.left != null) {
                queue.offer(node.left);
                levels.offer(level - 1);
            }
            if(node.right != null) {
                queue.offer(node.right);
                levels.offer(level + 1);
            }
        }

        for(int level = minLevel; level <= maxLevel; ++level){
            if(levelNodeMap.containsKey(level)){
                ArrayList<Integer> nodes = levelNodeMap.get(level);
                result.addAll(nodes);
            }
        }

        return result;
    }
    //Almost Working SOlution of POTD for 30 September,2021

//    static HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
//    static ArrayList <Integer> verticalOrder(Node root)
//    {
//        // add your code here
//        hm.clear();
//        count(root,0);
//        Integer [] keys = hm.keySet().toArray(new Integer[0]);
//        Arrays.sort(keys);
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int key : keys){
//            List<Integer> nodes = hm.get(key);
//            for(int i=0;i<nodes.size();i++){
//                l.add(nodes.get(i));
//            }
//        }
//        return l;
//    }
//    public static void count(Node n, int col){
//        ArrayList<Integer> curr = new ArrayList<>();
//        if(!hm.containsKey(col)){
//            curr.add(n.data);
//            hm.put(col,curr);
//        }
//        else {
//            curr = hm.get(col);
//            curr.add(n.data);
//            hm.put(col,curr);
//        }
//        if(n.left!=null)
//            count(n.left,col-1);
//        if(n.right!=null)
//            count(n.right,col+1);
//        else return;
//    }

    public static void main(String[] args) {

    }
}
