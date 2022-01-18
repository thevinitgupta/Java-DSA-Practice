package Trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> forest = new ArrayList<>();
        Set<Integer> del = new HashSet<>();

        for(int i=0;i<to_delete.length;i++){
            del.add(to_delete[i]);
        }

        makeForest(root,del,forest);
        if(!del.contains(root.val)){
            forest.add(root);
        }
        return forest;
    }
    public TreeNode makeForest(TreeNode root, Set<Integer> del,List<TreeNode> forest){
        if(root==null) return null;

        root.left = makeForest(root.left,del,forest);
        root.right = makeForest(root.right,del,forest);

        if(del.contains(root.val)){

            if(root.left!=null) forest.add(root.left);

            if(root.right!=null) forest.add(root.right);

            return null;
        }

        return root;
    }
}
