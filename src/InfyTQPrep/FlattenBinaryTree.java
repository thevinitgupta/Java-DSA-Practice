package InfyTQPrep;

import Trees.Node;

public class FlattenBinaryTree {
    public static void flatten(Node root)
    {
        root = flat(root);
    }
    public static Node flat(Node root){
        if(root==null) return null;
        Node left = flat(root.left);
        Node right = root.right;
        if(left!=null) {
            root.right= left;
            root.left = null;
            while(left.right!=null) left = left.right;
            left.right = flat(right);
        }
        else root.right = flat(right);
        return root;
    }
}
