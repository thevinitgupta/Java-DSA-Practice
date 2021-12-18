package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class AverageLevelsOfBinaryTree {
    static HashMap<Integer,ArrayList<Double>> lev;
    static int max;
    public List<Double> averageOfLevels(TreeNode root) {
        lev = new HashMap<>();
        max = 0;
        getLevelData(root,0);
        //System.out.println(lev);
        List<Double> averages = new ArrayList<>();
        for(int i=0;i<=max;i++){
            ArrayList<Double> l = lev.get(i);
            double avg = l.get(1)/l.get(0);
            averages.add(avg);
        }
        return averages;

    }
    private static void getLevelData(TreeNode root,int level){
        if(root==null) return;
        if(level>max) max = level;
        ArrayList<Double> curr = new ArrayList<>();
        double tot = 0.0d,size=0.0d;
        if(lev.containsKey(level)){
            curr = lev.get(level);
            tot = curr.get(1);
            size = curr.get(0);
            tot += root.val;
            size += 1;
            curr.set(0,size);
            curr.set(1,tot);
        }
        else {
            curr.add(size+1);
            curr.add(tot+root.val);
        }
        lev.put(level,curr);
        getLevelData(root.left,level+1);
        getLevelData(root.right,level+1);
        return;
    }
}
