package Trees;

public class TestBinary {
    public static void main(String[] args) {
        BinaryTree bn = new BinaryTree(5);
        bn.insert(bn.root,4);
        bn.print("pre");
        bn.insert(bn.root,3);
        bn.print("pre");
        bn.insert(bn.root,6);
        bn.print("pre");
        bn.insert(bn.root,1);
        bn.insert(bn.root,8);
        bn.print("pre");
    }
}
