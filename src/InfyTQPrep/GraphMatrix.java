package InfyTQPrep;

import java.util.Arrays;

public class GraphMatrix {
    public static int [][] createGraph(int [] start, int [] end, int n){
        int [][] graph  = new int[n][n];
        for(int i=0;i< start.length;i++){
            graph[start[i]][end[i]] = 1;
            graph[end[i]][start[i]] = 1;
        }
        return graph;
    }
    public static void main(String[] args) {
        int [] start = {1,3,5,2,7,4};
        int [] end = {2,4,2,6,3,1};
        int [][] graph = createGraph(start,end, 8);
        for (int i=0;i<graph.length;i++){
            System.out.println(Arrays.toString(graph[i]));
        }
    }
}
