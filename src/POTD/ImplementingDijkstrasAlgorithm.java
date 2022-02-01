package POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ImplementingDijkstrasAlgorithm {
    static class Node{
        int vertex,weight;

        Node(int vertex,int weight){
            this.vertex =vertex;
            this.weight =weight;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){

            public int compare(Node a,Node b){

                return a.weight-b.weight;
            }

        });

        int distance[]= new int [V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S] =0;
        pq.add(new Node(S,0));
        while(!pq.isEmpty()){
            Node node =pq.poll();
            for(ArrayList<Integer>it :adj.get(node.vertex)){
                int v=it.get(0);
                int w=it.get(1);
                if(node.weight + w < distance[v]){
                    distance[v] =node.weight + w;
                    pq.add(new Node(v,distance[v]));
                }

            }
        }
        return distance;
    }
}
