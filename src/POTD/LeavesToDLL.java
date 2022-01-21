package POTD;

import Trees.Node;

import java.util.ArrayList;
import java.util.List;

public class LeavesToDLL {
    public Node convertToDLL(Node root)
    {
        // Code here
        List<Integer> leaves = new ArrayList<>();
        root = getLeaves(root,leaves);
        Node head = new Node(0);
        Node temp = head,prev = null;
        for(int i=0;i<leaves.size();i++){
            temp.right = new Node(leaves.get(i));
            temp = temp.right;
            temp.left = prev;
            prev = temp;
            //System.out.println(prev.data);
        }
        head = head.right;
        head.left = null;
        return head;
    }
    private static Node getLeaves(Node root, List<Integer> leaves){
        if(root==null) return null;
        if(root.left==null && root.right==null){
            leaves.add(root.data);
            return null;
        }

        root.left = getLeaves(root.left,leaves);
        root.right = getLeaves(root.right,leaves);
        return root;
    }
}
