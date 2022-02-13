package POTD;

import Trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LargestValueInEachLevel {
    public ArrayList<Integer> largestValues(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> largest = new ArrayList<>();

        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            int max = -1;
            for(int i=0;i<n;i++){
                Node front = q.peek();
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
                max = Math.max(front.data,max);
                q.remove();
            }
            largest.add(max);
        }
        return largest;
    }
}
