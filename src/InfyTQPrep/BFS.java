package InfyTQPrep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, boolean [] visited, int start, List<Integer> bfs){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while(!q.isEmpty()){
            int front = q.poll();
            if(!visited[front]){
                visited[front] = true;
                List<Integer> curr = graph.get(front);
                for(int i=0;i<curr.size();i++){
                    if(!visited[curr.get(i)]) q.add(curr.get(i));
                }
                bfs.add(front);
            }
        }

    }
    public static ArrayList<ArrayList<Integer>> createGraph(int [] start, int [] end, int n){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++) graph.add(new ArrayList<Integer>());
        for(int i=0;i< start.length;i++){
            graph.get(start[i]).add(end[i]);
            graph.get(end[i]).add(start[i]);
        }
        return graph;
    }
    public static void main(String[] args) {
        int [] start = {1,3,5,2,7,4};
        int [] end =   {2,4,2,6,3,1};
        ArrayList<ArrayList<Integer>> graph = createGraph(start,end, 7);
        boolean [] visited = new boolean[graph.size()];
//        for (int i=1;i<graph.size();i++){
//            System.out.println(graph.get(i));
//        }
        List<Integer> bfs = new ArrayList<>();
        for(int i = 1;i< graph.size();i++){
            if(!visited[i]) {
                bfsTraversal(graph,visited,i,bfs);
            }
        }
        System.out.println(bfs);
    }
}
