package POTD;

import Trees.BinaryTree;
import Trees.Node;

public class LowestCommonAncestorInBinaryTree {
    static Node lca(Node root, int n1, int n2)
    {
        if(root == null) return null;
        if(root.key == n1 || root.key == n2) return root;
        Node left = lca(root.left, n1, n2);
        if(left == null) return lca(root.right, n1, n2);
        Node right = lca(root.right, n1, n2);
        if(right != null) return root;
        return left;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.create();
        bt.print("pre");
        Node common = lca(bt.root,3,1);
        System.out.println(common.key);
    }
}
