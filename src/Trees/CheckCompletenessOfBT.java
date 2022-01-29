package Trees;

public class CheckCompletenessOfBT {
    boolean check = false;
    public boolean isCompleteTree(TreeNode root) {
        int h = height(root);
        return helper(root, h, 1);
    }

    public boolean helper(TreeNode root, int h, int depth){
        if(root == null){
            if(depth < h) return false;
            if(depth > h) return true;
            if(depth == h && !check) check = true;
            return true;
        }
        else if(depth == h && check) return false;
        return helper(root.left, h, depth + 1) && helper(root.right, h, depth + 1);

    }

    public int height(TreeNode root){
        if(root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }
}
