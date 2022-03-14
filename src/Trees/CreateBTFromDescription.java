package Trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CreateBTFromDescription {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        for (int[] arr : descriptions) {
            int parent = arr[0], child = arr[1], isLeft = arr[2];
            children.add(child);
            TreeNode node = map.getOrDefault(parent, new TreeNode(parent));
            if (isLeft == 1) {
                node.left = map.getOrDefault(child, new TreeNode(child));
                map.put(child, node.left);
            } else {
                node.right = map.getOrDefault(child, new TreeNode(child));
                map.put(child, node.right);
            }
            map.put(parent, node);
        }

        int root = -1;
        for (int [] arr: descriptions) {
            if (!children.contains(arr[0])) {
                root = arr[0];
                break;
            }
        }

        return map.getOrDefault(root, null);
    }
}
