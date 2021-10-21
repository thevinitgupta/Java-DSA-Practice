package Trees;

public class Node {
    public int key;
    public Node left, right;

    Node(int key) {
        this.key = key;
        left = right = null;
    }
}
