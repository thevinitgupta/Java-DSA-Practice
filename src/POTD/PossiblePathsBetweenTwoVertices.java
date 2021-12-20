package POTD;

import java.util.ArrayList;

public class PossiblePathsBetweenTwoVertices {
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                          int destination) {
        if(source == destination) return 1;
        int[] count = new int[1];

        boolean[] visited = new boolean[V];

        dfs(adj, source, destination, count, visited);
        return count[0];
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, int source, int destination, int[] count, boolean[] visited){
        if(source == destination){
            count[0] +=1;
            return;
        }
        if(visited[source]){
            return;
        }

        visited[source] = true;

        ArrayList<Integer> children = adj.get(source);

        for(Integer child: children){
            dfs(adj, child, destination, count, visited);
        }

        visited[source] = false;
    }

}
