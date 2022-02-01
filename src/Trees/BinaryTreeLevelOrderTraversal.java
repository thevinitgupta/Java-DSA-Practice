package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderOptimized(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        inOrder(root,0,levels);
        return levels;
    }
    private static void inOrder(TreeNode root,int level, List<List<Integer>> levels){
        if(root==null) return;
        List<Integer> vals = new ArrayList<>();
        if(level<levels.size()){
            vals = levels.get(level);
            vals.add(root.val);
            levels.set(level,vals);
        }
        else {
            vals.add(root.val);
            levels.add(vals);
        }
        inOrder(root.left,level+1,levels);
        inOrder(root.right,level+1,levels);
    }
    static HashMap<Integer, List<Integer>> lev;
    static int max;
    public List<List<Integer>> levelOrder(TreeNode root) {
        lev = new HashMap<>();
        max =-1;
        List<List<Integer>> levels = new ArrayList<>();
        //if(root==null) return levels;
        preOrder(root,0);
        for(int i=0;i<=max;i++){
            levels.add(lev.get(i));
        }
        return levels;
    }
    private static void preOrder(TreeNode root,int level){
        if(root==null) return;
        //System.out.println(root.val);
        preOrder(root.left,level+1);
        List<Integer> vals = new ArrayList<>();
        if(lev.containsKey(level)){
            vals = lev.get(level);
        }
        max = Math.max(level,max);
        vals.add(root.val);
        lev.put(level,vals);
        preOrder(root.right,level+1);
    }
}
