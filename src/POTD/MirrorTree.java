package POTD;

import Trees.Node;

public class MirrorTree {
    void mirror(Node node) {
        // Your code here
        Node temp = node;
        if(temp==null){
            return;
        }
        else {
            Node copy = temp.left;
            temp.left = temp.right;
            temp.right = copy;
            mirror(temp.left);
            mirror(temp.right);
        }
    }
}
