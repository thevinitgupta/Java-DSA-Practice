package POTD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class GadgetsOfDoraland {
    public class Pair implements Comparable<Pair>{
        int id;
        int val;
        Pair(int id,int val){
            this.id=id;
            this.val=val;
        }
        public int compareTo(Pair o){
            if(this.val==o.val)
                return this.id-o.id;
            return this.val-o.val;
        }
    }
    ArrayList<Integer> TopK(ArrayList<Integer> array, int k)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:array){
            if(hm.containsKey(a)==false)
                hm.put(a,1);
            else
                hm.put(a,hm.get(a)+1);
        }
        for(int key:hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }

        for(int i=0;i<k;i++){
            Pair rp=pq.remove();
            ans.add(rp.id);
        }
        return ans;
    }
}
