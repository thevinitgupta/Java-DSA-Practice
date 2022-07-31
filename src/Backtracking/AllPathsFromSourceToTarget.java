package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                ArrayList<Integer> curr = new ArrayList<>();
                if(map.containsKey(i)){
                    curr = map.get(i);
                }
                curr.add(graph[i][j]);
                map.put(i,curr);
            }
        }
        // System.out.println(map);
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(!map.containsKey(0)) return paths;
        generate(map, 0, paths, path, graph.length);
        return paths;
    }
    public static void generate(HashMap<Integer, ArrayList<Integer>> map, int pos, List<List<Integer>> paths, List<Integer> path, int n){
        if(pos>=n) return;
        path.add(pos);
        // System.out.println(path);
        if(pos==n-1) {
            paths.add(path);
            return;
        }
        if(!map.containsKey(pos)) return;
        ArrayList<Integer> trav = map.get(pos);
        // System.out.println(path+","+trav);
        for(int i=0;i<trav.size();i++){
            List<Integer> curr = new ArrayList<>();
            curr.addAll(path);
            generate(map,trav.get(i),paths,curr,n);
        }
        return;
    }
}
