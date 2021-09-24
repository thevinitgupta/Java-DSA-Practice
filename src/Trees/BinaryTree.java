package Trees;

class Node {
    int key;
    Node left,right;
    Node(int key){
        this.key = key;
        left=right=null;
    }
}
public class BinaryTree {
    Node root;

    //constructor for initializing
    BinaryTree(int key){
        root = new Node(key);
    }
    //empty constructor, so set value of root = null
    BinaryTree(){
        root = null;
    }

    /*           5
            4         6
         1       3        2
    * 10    14      7  8     12
    *
    *
    *
    * */


    Node insert(Node root,int val){
        Node n = new Node(val);
        if(root == null) {
            root = n;
            return root;
        }
        else {
            if(root.left==null) root.left = n;
            else if(root.left!=null){
                return insert(root.left,val);
            }
            else if(root.right==null) root.right = n;
            else if(root.right!=null){
                return insert(root.right,val);
            }
        }
        return root;
    }
    void print(String choice){
        if(choice.compareToIgnoreCase("pre")==0) {
            System.out.println("Pre Order Traversal : ");
            preOrder(this.root);
            System.out.println("");
        }
        else if(choice.compareToIgnoreCase("post")==0){
            System.out.println("Post Order Traversal : ");
            postOrder(this.root);
            System.out.println("");
        }
        else {
            System.out.println("In Order Traversal : ");
            inOrder(this.root);
            System.out.println("");
        }
    }
    void preOrder(Node node){
            if (node == null)
                return;

            /* first print data of node */
            System.out.print(node.key + " ");

            /* then recur on left sutree */
            preOrder(node.left);

            /* now recur on right subtree */
            preOrder(node.right);
    }
    void inOrder(Node node){
        if (node == null)
            return;

        /* first recur on left sutree */
        preOrder(node.left);

        /* then print data of node */
        System.out.print(node.key + " ");

        /* now recur on right subtree */
        preOrder(node.right);
    }
}
