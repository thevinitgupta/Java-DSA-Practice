package POTD;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumGCDOfAllSiblings {

    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            ArrayList<Integer> curr = new ArrayList<>();
            ArrayList<Integer> a = arr.get(i);
            if(map.containsKey(a.get(0))){
                curr = map.get(a.get(0));
            }
            curr.add(a.get(1));
            map.put(a.get(0),curr);
        }

        int max = 0;
        for(Integer key : map.keySet()){
            ArrayList<Integer> curr = map.get(key);
            int gcd = curr.size()>1 ? calc(curr.get(0),curr.get(1)) : 0;
            max = Math.max(max,gcd);
        }
        return max;
    }
    static int calc(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a>b)
            return calc(b,a%b);
        else return calc(a,b%a);
    }
}
