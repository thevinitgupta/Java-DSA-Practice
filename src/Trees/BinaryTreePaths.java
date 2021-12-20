package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        return getPaths(root,"");
    }
    private static List<String> getPaths(TreeNode root, String prev){
        List<String> paths = new ArrayList<>();
        if(root==null) return paths;
        if(prev=="") prev += root.val;
        else prev += "->"+root.val;

        if(root.left==null && root.right==null) {
            paths.add(prev);
            return paths;
        }
        paths.addAll(getPaths(root.left,prev));
        paths.addAll(getPaths(root.right,prev));

        return paths;
    }
}
