package POTD;

import Trees.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftViewOfBinaryTree {
    static int max ;
    static HashMap<Integer,int[]> val ;
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        max = 0;
        val = new HashMap<>();
        ArrayList<Integer> left = new ArrayList<>();
        getView(root,0,0);
        for(int i=0;i<=max;i++){
            if(val.containsKey(i))
                left.add(val.get(i)[1]);
        }
        return left;
    }
    private static void getView(Node root, int level, int col){
        if(root==null) return;
        int [] curr = new int[2];
        if(!val.containsKey(level)){
            curr[0] = col;
            curr[1] = root.data;
            val.put(level,curr);
        }
        if(level>max) max = level;
        getView(root.left,level+1,col-1);
        getView(root.right,level+1,col+1);
    }
}
