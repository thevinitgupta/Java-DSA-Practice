package Trees;

public class BinaryTreeToCDLL {
    Node head,prev;
    Node bTreeToClist(Node root)
    {
        head=null;
        prev=null;
        convert(root);
        root=head;
        while(root.right!=null){
            root = root.right;
        }
        head.left = root;
        root.right = head;
        return head;
    }
    void convert(Node root){
        if(root==null) return;
        convert(root.left);

        if(prev==null) head=root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convert(root.right);
    }
}
