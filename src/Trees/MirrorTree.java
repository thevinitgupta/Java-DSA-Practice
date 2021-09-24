package Trees;

public class MirrorTree {
    void mirror(Node node) {
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

/*
* Node copy;
            if(node.left==null && node.right!=null){
                copy = node.right;
                node.right=null;
                node.left = copy;
            }
            else if(node.right==null && node.left!=null){
                copy = node.left;
                node.left=null;
                node.right = copy;
            }
            else {
                copy = node.left;
                node.left = node.right;
                node.right = copy;
            }
            mirror(node.left);
            mirror(node.right);
* */