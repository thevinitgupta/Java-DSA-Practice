package POTD;

import java.util.*;

class Pair{
    int nbr;
    int dia;

    public Pair(int nbr, int dia){
        this.nbr = nbr;
        this.dia = dia;
    }
}
public class WaterConnectionProblem {
    int min = Integer.MAX_VALUE;

    ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a , ArrayList<Integer> b , ArrayList<Integer> d)
    {
        // code here
        Map<Integer, Pair> outgoing = new HashMap<>();
        Map<Integer, Integer> incoming = new HashMap<>();

        for(int i=0; i<a.size(); i++){
            int u = a.get(i), v = b.get(i);
            outgoing.put(u, new Pair(v, d.get(i)));
            incoming.put(v, u);
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            //check the house that has outgoing edge but no incoming edge
            if(outgoing.containsKey(i) && incoming.get(i) == null){
                ArrayList<Integer> al = new ArrayList<>();
                //node marking the begining of a component
                al.add(i);
                dfs(outgoing, i, al);
                //adding the min diameter between nodes of the component
                al.add(min);
                //reinitialising min dia value
                min = Integer.MAX_VALUE;
                res.add(al);
            }
        }

        return res;
    }
    private void dfs(Map<Integer, Pair> outgoing, int src, ArrayList<Integer> al){
        //just move on to next node if the cur node has an outgoing edge i.e other guy has an incoming edge
        if(outgoing.containsKey(src)){
            Pair p = outgoing.get(src);
            if(p.dia < min){
                min = p.dia;
            }

            dfs(outgoing, p.nbr, al);
        } else{
            //node with no incoming edge found hence marking the end of a component
            al.add(src);
        }
    }
}


