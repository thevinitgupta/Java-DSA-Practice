package POTD;

public class IsBinaryTreeHeap {
    int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    boolean checkHeap(Node root, int index, int n){
        if(root==null) return true;
        else if(index>n) return false;
        if((root.left!=null && root.left.data >= root.data) ||  (root.right!=null && root.right.data >= root.data))
            return false;
        return checkHeap(root.left,2*index+1,n) && checkHeap(root.right,2*index+2,n);
    }
    boolean isHeap(Node tree) {
        // code here
        int n = size(tree);
        if(n==1) return true;
        return checkHeap(tree,0,n);
    }
}
