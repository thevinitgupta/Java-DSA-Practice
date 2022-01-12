package POTD;

import Trees.Node;

public class CheckIfSubtree {
    public static boolean isSubtree(Node t, Node s) {
        // add code here.
        if(t==null) return false;
        return isSame(t,s) || isSubtree(t.left,s) || isSubtree(t.right,s);
    }
    private static boolean isSame(Node t,Node s){
        if(t==null && s==null) return true;
        else if(t==null || s==null) return false;
        if(t.data==s.data){
            return isSame(t.left,s.left) && isSame(t.right,s.right);
        }
        else return false;
    }
}
