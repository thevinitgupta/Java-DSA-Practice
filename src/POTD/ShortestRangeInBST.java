package POTD;
import Trees.Node;

import java.util.*;

class Range {
    int x ,y;
    Range(){
        this.x = 0;
        this.y = 0;
    }
    Range(int a,int b){
        this.x = a;
        this.y = b;
    }
}

public class ShortestRangeInBST {
//    HashMap<Integer, ArrayList<Integer>> map;
//            int maxLevel = 0;
//    public Range shortestRange(Node root) {
//        // Your code goes here
//        Range r = new Range();
//        if(root.left==null && root.right==null) {
//            r.x = root.data;
//            r.y = root.data;
//            return r;
//        }
//        map = new HashMap<>();
//        maxLevel = 0;
//        getLevelOrder(root,0);
//        System.out.println(map);
//        return r;
//    }
//    public void getLevelOrder(Node root,int level){
//        if(root==null) return;
//        if(level>maxLevel) maxLevel = level;
//        ArrayList<Integer> list = new ArrayList<>();
//        if(map.containsKey(level)){
//            list = map.get(level);
//        }
//        list.add(root.data);
//        getLevelOrder(root.left,level+1);
//        getLevelOrder(root.right,level+1);
//    }

    public Range shortestRange(Node root) {
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        levelOrderTraversal(root,1,map);

        List<List<Integer>> level = new ArrayList<List<Integer>>();

        int i=1;
        while (map.get(i) != null) {
            level.add(map.get(i));
            i++;
        }
        return smallestRange(level);
    }
    Map<Integer,List<Integer>> levelOrderTraversal(Node node, int level, Map<Integer,List<Integer>> map) {
        if (node == null)
            return map;

        List<Integer> list = map.getOrDefault(level, new ArrayList<Integer>());
        list.add(node.data);

        map.put(level, list);

        levelOrderTraversal(node.left, level+1, map);
        levelOrderTraversal(node.right, level+1, map);

        return map;
    }
    public Range smallestRange(List<List<Integer>> nums) {
        if(nums.isEmpty()) return new Range(0,0);

        Range range = new Range(0, Integer.MAX_VALUE);

        PriorityQueue<LinkedList<Integer>> minHeap = new PriorityQueue<>((a, b) -> (a.peek() - b.peek()));
        PriorityQueue<LinkedList<Integer>> maxHeap = new PriorityQueue<>((a, b) -> (b.peek() - a.peek()));

        for(List<Integer> list: nums) {
            LinkedList<Integer> linkedList = new LinkedList<>(list);
            minHeap.add(linkedList);
            maxHeap.add(linkedList);
        }

        while(minHeap.size() == nums.size()) {
            LinkedList<Integer> minList = minHeap.poll();
            LinkedList<Integer> maxList = maxHeap.poll();

            int min = minList.getFirst();
            int max = maxList.getFirst();

            minList.removeFirst();

            if(minList.size() > 0) {
                minHeap.add(minList);
                maxHeap.add(maxList);
                if(!maxList.equals(minList)) {
                    maxHeap.remove(minList);
                    maxHeap.add(minList);
                }
            }
            if((range.y - range.x) > (max - min))
                range = new Range(min, max);
        }
        return range;
    }
}
