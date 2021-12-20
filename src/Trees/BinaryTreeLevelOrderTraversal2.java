package Trees;

import java.util.*;
public class BinaryTreeLevelOrderTraversal2 {
    static HashMap<Integer,List<Integer>> lev;
    static int max;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        max = -1;
        lev = new HashMap<>();
        getLevelOrder(root,0);
        List<List<Integer>> levelTrav = new ArrayList<>();
        for(int i=max;i>=0;i--){
            levelTrav.add(lev.get(i));
        }
        return levelTrav;
    }
    static void getLevelOrder(TreeNode root, int level){
        if(root==null) return;
        List<Integer> currLev = new ArrayList<>();
        if(lev.containsKey(level)){
            currLev = lev.get(level);
        }
        currLev.add(root.val);
        lev.put(level,currLev);
        max = Math.max(max,level++);
        getLevelOrder(root.left,level);
        getLevelOrder(root.right,level);
    }
}
