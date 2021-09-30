package Trees;

import javax.swing.tree.TreeNode;
import java.util.*;

public class VerticalOrderTraversalOfBinaryTree {
    //Solution for Leetcode Q-987

    //Solution almost working, failing on submission

//    static HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        hm.clear();
//        count(root,0);
//        Integer [] keys = hm.keySet().toArray(new Integer[0]);
//        Arrays.sort(keys);
//        List<List<Integer>> l = new ArrayList<>();
//        for(int key : keys){
//            List<Integer> nodes = hm.get(key);
//            Collections.sort(nodes);
//            l.add(nodes);
//        }
//        return l;
//    }
//    public static void count(TreeNode n, int col){
//        ArrayList<Integer> curr = new ArrayList<>();
//        if(!hm.containsKey(col)){
//            curr.add(n);
//            hm.put(col,curr);
//        }
//        else {
//            curr = hm.get(col);
//            curr.add(n.val);
//            hm.put(col,curr);
//        }
//        if(n.left!=null)
//            count(n.left,col-1);
//        if(n.right!=null)
//            count(n.right,col+1);
//        return;
//    }
    public static void main(String[] args) {
        BinaryTree bt  = new BinaryTree();
        bt.create();

    }
}
