package InfyTQPrep;

import java.util.ArrayList;

public class DFS {
    private static ArrayList<ArrayList<Integer>> buildGraph(int [] start, int [] end, int n){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<start.length;i++){
            graph.get(start[i]).add(end[i]);
            graph.get(end[i]).add(start[i]);
        }
        return graph;
    }
    public static void dfsTraversal(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> dfs, int node, boolean [] visited){
        if(visited[node]) return;
        dfs.add(node);
        visited[node] = true;
        ArrayList<Integer> curr = graph.get(node);
        for(int i=0;i<curr.size();i++){
            if(!visited[curr.get(i)]) dfsTraversal(graph,dfs, curr.get(i), visited);
        }
        return;
    }
    public static void main(String[] args) {
        int [] start = {1,3,5,2,7,4};
        int [] end =   {2,4,2,6,3,1};
        ArrayList<ArrayList<Integer>> graph = buildGraph(start, end, 7);

        ArrayList<Integer> dfs = new ArrayList<>();
        boolean [] visited = new boolean[graph.size()];
        for(int i=0;i<graph.size();i++){
            if(!visited[i]){
                dfsTraversal(graph,dfs, i, visited);
            }
        }
        System.out.println(dfs);
    }
}
