package POTD;

import Trees.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfNodesWithinKDistance {
    static Map<Node,Node> hm;
    static Node tar;
    static int sum;
    static Set<Node> vis;
    static void parent(Node n,Node p,int target){
        if(n==null)
            return;
        if(n.data==target)
            tar=n;
        hm.put(n,p);
        parent(n.left,n,target);
        parent(n.right,n,target);
    }
    static void solve(Node root, int k){
        if(root==null)
            return;
        if(k<0)
            return;
        if(vis.contains(root))
            return;
        sum+=root.data;
        vis.add(root);
        solve(root.left,k-1);
        solve(root.right,k-1);
        solve(hm.get(root),k-1);
    }
    static int sum_at_distK(Node root, int target, int k){
        // code here
        hm=new HashMap<>();
        tar=null;
        vis=new HashSet<>();
        parent(root,null,target);
        sum=0;
        solve(tar,k);
        return sum;
    }
}
