package InfyTQPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphList {
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
        int [] end = {2,4,2,6,3,1};
        ArrayList<ArrayList<Integer>> graph = createGraph(start,end, 8);
        for (int i=1;i<graph.size();i++){
            System.out.println(graph.get(i));
        }
    }
}
