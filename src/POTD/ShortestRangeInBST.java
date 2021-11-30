package POTD;

import Trees.Node;

class Range {
    int x ,y;
    Range(){
        this.x = 0;
        this.y = 0;
    }
    Range(int a,int b){
        this.x = a;
        this.y = b;
    }
}

public class ShortestRangeInBST {
    public Range shortestRange(Node root) {
        // Your code goes here
        Range r = new Range();
        if(root.left==null && root.right==null) {
            r.x = root.data;
            r.y = root.data;
        }
    }
}
