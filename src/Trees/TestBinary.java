package Trees;

public class TestBinary {
    public static void main(String[] args) {
        BinaryTree bn = new BinaryTree();
        bn.root = bn.create();
        bn.print("pre");
        bn.print("post");
        bn.print("");
    }
}
