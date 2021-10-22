package POTD;
import Trees.Node;

import java.util.*;

class qObj
{
    Node node;
    int level;
    qObj(Node n,int l)
    {
        node=n;
        level=l;
    }
}
public class TopViewOfBinaryTree {
    /*
    * {
    *   -1 : [h:2,key : 20],
    *   .
    *   .
    *   .
    * }
    * */

    //my solution which works perfect
    static HashMap<Integer,ArrayList<Integer>> view = new HashMap<>();
    static int min = 0,max = 0;
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> rootVals = new ArrayList<>();
        rootVals.add(1);
        rootVals.add(root.data);
        view.put(0,rootVals);
        if(root.left!=null) getTop(root.left,2,-1);
        if(root.right!=null) getTop(root.right,2,1);
        ArrayList<Integer> topView = new ArrayList<>();
        for(int i=min;i<=max;i++){
            topView.add(view.get(i).get(1));
        }
        return topView;
    }
    static void getTop(Node root, int h, int col){
        if(root==null) return;
        if(view.containsKey(col)){
            ArrayList<Integer> vals = view.get(col);
            if( h<vals.get(0)) {
                vals.set(0,h);
                vals.set(1,root.data);
                view.put(col,vals);
            }
        }
        else if(col!=0) {
            if(col<min || col>max){
                ArrayList<Integer> vals = new ArrayList<>();
                vals.add(h);
                vals.add(root.data);
                view.put(col,vals);
                min = Math.min(col,min);
                max = Math.max(col,max);
            }
        }
        if(root.left!=null) getTop(root.left,h+1,col-1);
        if(root.right!=null) getTop(root.right,h+1,col+1);
    }

    public static ArrayList<Integer> topViewCopied(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        //creating empty queue for level order traversal.
        Queue<qObj> q=new LinkedList<qObj>();
        q.add(new qObj(root,1));

        //creating a map to store nodes at a particular horizontal distance.
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

        while(!q.isEmpty())
        {
            qObj popped=q.poll();
            if(!map.containsKey(popped.level))
                map.put(popped.level,popped.node.data);

            //if left child of popped.node exists, pushing it in
            //the queue with the horizontal distance.
            if(popped.node.left!=null)
                q.add(new qObj(popped.node.left,popped.level-1));

            //if right child of popped.node exists, pushing it in
            //the queue with the horizontal distance.
            if(popped.node.right!=null)
                q.add(new qObj(popped.node.right,popped.level+1));
        }

        //traversing the map and storing the nodes in list
        //at every horizontal distance.
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            ans.add(e.getValue());
        }

        //returning the output list.
        return ans;
    }
}
