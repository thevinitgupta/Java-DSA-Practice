package Trees;

import java.util.ArrayList;
import java.util.HashMap;

class Frequency{
    public HashMap<Integer,Integer> freqMap;
    public int maxCount,maxVal,minVal;
    Frequency(){
        freqMap = new HashMap<>();
        maxCount=0;
        maxVal = Integer.MIN_VALUE;
        minVal = Integer.MAX_VALUE;
    }
    public void update(int val){
        int count=0;
        //System.out.println(this.freqMap);
        if(this.freqMap.containsKey(val)){
            count = this.freqMap.get(val);
        }
        count++;
        if(count>this.maxCount){
            this.maxCount = count;
        }
        if(val>=maxVal) this.maxVal = val;
        if(val<=minVal) this.minVal = val;
        this.freqMap.put(val,count);
        //System.out.println(this.freqMap+", maxCount => "+maxVal);
    }
}
public class FindModeInBST {
    public int[] findMode(TreeNode root) {
        Frequency f = new Frequency();
        f = getFrequencies(root,f);
        ArrayList<Integer> m = new ArrayList<>();
        for(int i=f.minVal;i<=f.maxVal;i++){
            if(f.freqMap.containsKey(i)){
                int c = f.freqMap.get(i);
                if(c==f.maxCount) m.add(i);
            }
        }
        System.out.println(m);
        int [] modes = new int[m.size()];
        for(int i=0;i<m.size();i++){
            modes[i] = m.get(i);
        }
        return modes;
    }
    public static Frequency getFrequencies(TreeNode root,Frequency f){
        if(root==null) return f;
        f.update(root.val);
        f = getFrequencies(root.left,f);
        f = getFrequencies(root.right,f);
        return f;
    }
}
