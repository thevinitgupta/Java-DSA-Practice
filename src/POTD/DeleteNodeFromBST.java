package POTD;

import Trees.Node;

public class DeleteNodeFromBST {
    public static Node deleteNode(Node root, int x) {
        if(root == null) return null;

        if(root.key < x)
            root.left = deleteNode(root.left, x);
        else if (root.key > x)
            root.right = deleteNode(root.right, x);
        else {
            if(root.left == null || root.right == null)
                return root.left == null ? root.right : root.left;

            root.key = inorderSuccessor(root.right);

            root.right = deleteNode(root.right, root.key);

            return root;
        }
        return root;
    }
    private static int inorderSuccessor(Node root) {
        while(root.left != null)
            root = root.left;

        return root.key;
    }
}
