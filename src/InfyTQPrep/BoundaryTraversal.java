package InfyTQPrep;

import Trees.Node;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static boolean isLeaf(Node node){
        return node.left==null && node.right==null;
    }

    //left boundary except leaf nodes
    public static void leftBoundary(Node node, ArrayList<Integer> boundary){
        if(node==null) return;
        if(isLeaf(node)) return;
        boundary.add(node.data);
        if(node.left!=null) leftBoundary(node.left, boundary);
        else leftBoundary(node.right, boundary);
    }

    //leaf nodes using Inorder
    public static void getLeaf(Node node, ArrayList<Integer> boundary){
        if(node==null) return;
        if(isLeaf(node)){
            boundary.add(node.data);
            return;
        }

        if(node.left!=null) getLeaf(node.left, boundary);
        if(node.right!=null) getLeaf(node.right, boundary);
    }


    //right boundary except leaves
    public static void rightBoundary(Node node, ArrayList<Integer> boundary){
        ArrayList<Integer> clockwise = new ArrayList<>();
        Node curr = node;
        while(curr!=null){
            if(!isLeaf(curr)) clockwise.add(curr.data);
            if(curr.right!=null) curr= curr.right;
            else curr = curr.left;
        }

        for(int i=clockwise.size()-1;i>=0;i--){
            boundary.add(clockwise.get(i));
        }

        return;
    }

    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> boundary = new ArrayList<>();
        if(node==null) return boundary;
        boundary.add(node.data);
        leftBoundary(node.left, boundary);
        getLeaf(node.left,boundary);
        getLeaf(node.right,boundary);
        rightBoundary(node.right,boundary);
        return boundary;
    }
}
