package POTD;
import java.util.*;

public class CourseSchedule {
    static boolean[] rec;
    static boolean[] vis;

    static boolean isCycle(List<List<Integer>> graph, int currentVertex, Stack<Integer> order){

        if(rec[currentVertex]){
            return true;
        }

        if(vis[currentVertex]){
            return false;
        }

        rec[currentVertex] = true;
        vis[currentVertex] = true;

        for(int vertex : graph.get(currentVertex)){

            if(isCycle(graph,vertex,order)){
                return true;
            }

        }
        order.add(currentVertex);
        rec[currentVertex] = false;
        return false;

    }
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites)
    {
        // add your code here

        List<List<Integer>> graph = new ArrayList<>(n);
        Stack<Integer> order = new Stack<>();
        int[] res = new int[n];
        vis = new boolean[n];
        rec = new boolean[n];


        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(ArrayList<Integer> prerequisite : prerequisites){
            graph.get(prerequisite.get(1)).add(prerequisite.get(0));
        }

        for(int vertex=0;vertex<n;vertex++){
            if(!vis[vertex]){
                if(isCycle(graph,vertex,order)){
                    //  System.out.println("here");
                    return new int[]{};
                }
            }

        }

        int i=0;
        while(!order.isEmpty()){
            res[i++] = order.pop();
        }

        return res;
    }
}
