package POTD;

import Trees.Node;

public class AddAllGreaterValuesToNodesInBST {
    public Node modify(Node root)
    {
        getSum(root,0);
        return root;
    }
    public static Node getSum(Node root,int sum){
        if(root.left == null && root.right == null){
            root.data+=sum;
            return root;
        }


        Node temp = null;
        if(root.right != null)root.data+=getSum(root.right, sum).data;
        else root.data+=sum;
        if(root.left != null)temp = getSum(root.left, root.data);

        return temp==null ? root : temp;
    }
}
