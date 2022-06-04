package POTD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class VillainCon {
    static int minColour(int N, int M, int mat[][]) {
        // code here
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<N;i++)
            adj.add(new ArrayList<>());

        int[] inDeg = new int[N];

        for(int i=0;i<mat.length;i++){
            int u = mat[i][1]-1;
            int v = mat[i][0]-1;
            adj.get(u).add(v);
            inDeg[v]++;
        }

        for(int i=0;i<N;i++){
            if(inDeg[i]==0)
                queue.add(i);
        }

        int minCol = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            minCol++;
            for(int i=0;i<size;i++){
                int curr = queue.poll();
                for(int ele:adj.get(curr)){
                    inDeg[ele]--;
                    if(inDeg[ele]==0)
                        queue.add(ele);
                }
            }
        }
        return minCol;
    }

}
