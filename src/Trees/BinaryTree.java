package Trees;

import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = new Scanner(System.in);
    public Node root;

    //constructor for initializing
    public BinaryTree(int key){
        root = new Node(key);
    }
    //empty constructor, so set value of root = null
    public BinaryTree(){
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


    public Node create(){
        int val = 0;
        System.out.println("Enter the value of Node(or -1 if you want this node empty) :");
        val = sc.nextInt();
        if(val==-1) return null;
        Node newNode = new Node(val);
        System.out.println("Enter the left child of "+val);
        newNode.left = create();
        System.out.println("Enter the right child of "+val);
        newNode.right = create();
        return  newNode;
    }
    public void print(String choice){
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
        inOrder(node.left);

        /* then print data of node */
        System.out.print(node.key + " ");

        /* now recur on right subtree */
        inOrder(node.right);
    }
    void postOrder(Node node){
        if (node == null)
            return;

        /* first recur on left sutree */
        postOrder(node.left);

        /* now recur on right subtree */
        postOrder(node.right);

        /* then print data of node */
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(5);
        bt.root.left = new Node(4);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(6);
        bt.root.left.right = new Node(1);
        bt.root.right.left = new Node(8);
        bt.print("pre");
        bt.print("in");
        bt.print("post");
    }
}
