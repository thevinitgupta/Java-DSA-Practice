package Trees;

import java.util.List;
public class MaximumDepthOfNAryTree {
    public int maxDepth(NNode root) {
        return getMax(root,1,1);
    }
    public static int getMax(NNode root, int curr,int max){
        if(root==null) return 0;
        max = Math.max(curr,max);
        curr++;
        List<NNode> children = root.children;
        for(int i=0;i<children.size();i++){
            max = Math.max(max,  getMax(children.get(i),curr,max));
        }
        return max;
    }
}
