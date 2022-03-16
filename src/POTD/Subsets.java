package POTD;

import java.util.ArrayList;
import java.util.Collections;

public class Subsets {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> subs = new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();
        subs.add(sub);
        subs = getSubsets(A,subs,A.size()-1);
        Collections.sort(subs,(p, q)->{
                    int i = 0;
                    while(i < Math.min(p.size(), q.size())){
                        if(p.get(i) == q.get(i)){
                            i++;
                            continue;
                        }
                        if(p.get(i) < q.get(i)){
                            return -1;
                        }
                        return 1;
                    }
                    if(i < q.size()) return -1;
                    if(i < p.size()) return 1;
                    return 0;
                }
        );
        return subs;
    }
    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> subs, int k){
        if(k<0) return subs;
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        for(int i=0;i<subs.size();i++){
            ArrayList<Integer> copy = new ArrayList<>(subs.get(i));
            n.add(copy);
            ArrayList<Integer> sub = subs.get(i);
            sub.add(0,arr.get(k));
            n.add(sub);
        }
        return getSubsets(arr,n,k-1);
    }
}
