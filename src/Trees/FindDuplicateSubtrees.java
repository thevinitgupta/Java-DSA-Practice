package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String, List<TreeNode>> pres = new HashMap<>();
        List<TreeNode> dups = new ArrayList<>();
        getDups(root.left,pres,dups);
        getDups(root.right, pres, dups);
        return dups;
    }
    public static String getDups(TreeNode root, HashMap<String, List<TreeNode>> pres, List<TreeNode> dups){
        if(root==null) return "#,";

        String curr = root.val+",";
        curr += getDups(root.left,pres,dups);
        curr += getDups(root.right,pres,dups);
        List<TreeNode> nodes = new ArrayList<>();
        if(pres.containsKey(curr)){
            nodes = pres.get(curr);
        }
        nodes.add(root);
        if(nodes.size()==2) dups.add(root);
        pres.put(curr,nodes);
        return curr;
    }
}
