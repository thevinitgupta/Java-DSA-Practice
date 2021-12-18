package POTD;

import Trees.Node;

public class MaximumDifferenceBetweenNodeAndItsAncestor {
    static int max;
    int maxDiff(Node root)
    {
        //your code here
        max = Integer.MIN_VALUE;
        int min=getDiff(root);
        return max;
    }
    static int getDiff(Node root){
        int min;
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return root.data;
            // else if(root.left==null) return getDiff(root.right);
            // else if(root.right==null) return getDiff(root.left);
        else min = Math.min(getDiff(root.left),getDiff(root.right));

        max = Math.max(max,root.data-min);
        return Math.min(min,root.data);
    }
}
