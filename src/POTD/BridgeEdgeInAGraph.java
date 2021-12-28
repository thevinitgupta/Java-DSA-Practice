package POTD;

import java.util.ArrayList;

public class BridgeEdgeInAGraph {
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        boolean visited[] = new boolean[V];
        //  System.out.println(c);
        return find(V , adj ,c, c , d , visited);

    }


    static int find(int V, ArrayList<ArrayList<Integer>> adj,int start ,int c,int d , boolean visited[]){


        if(c == d){
            return 0;
        }

        if(visited[c] == true){
            return 1;
        }

        ArrayList<Integer> reachable = adj.get(c);
        visited[c] = true;


        for(int i=0 ;i<reachable.size();i++){

            if(c == start && reachable.get(i) == d)
                continue;

            if(!visited[reachable.get(i)]){
                //System.out.println(c);
                if( find(V , adj ,start, reachable.get(i) , d , visited) == 0){
                    return 0;
                }
            }
        }

        //visited[c] = false;

        return 1;

    }

}
