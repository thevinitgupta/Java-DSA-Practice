package Trees;

public class Node {
    public int key,data;
    public Node left, right,next;

    public Node(int key) {
        this.key = key;
        this.data = key;
        left = right = next = null;
    }
}
