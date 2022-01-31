package POTD;

import Trees.Node;

import java.util.ArrayList;

public class CousinsOfAGivenNode {
    public static ArrayList<Integer> printCousins(Node root, Node find)
    {
        ArrayList<Integer> list = new ArrayList<>();
        cousins(root, list, find, level(root, find, 0) - 1, 0);
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }

    public static void cousins(Node root, ArrayList<Integer> list, Node find, int level, int k) {
        if (root == null) {
            return;
        }
        if (k == level) {
            if (root.left != find && root.right != find) {
                if (root.left != null) {
                    list.add(root.left.data);
                }
                if (root.right != null) {
                    list.add(root.right.data);
                }
            }
            return;
        }
        cousins(root.left, list, find, level, k + 1);
        cousins(root.right, list, find, level, k + 1);
    }
    public static int level(Node root, Node find, int level) {
        if (root == null) {
            return 0;
        }
        if (root == find) {
            return level;
        }
        int left = level(root.left, find, level + 1);
        if (left > 0) {
            return left;
        }
        return level(root.right, find, level + 1);
    }
}
