package Contests.Adda247;

import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumPair {
    static int ZeroPairSum(int n, ArrayList<Integer> arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++){
            ArrayList<Integer> curr = new ArrayList<>();
            int val = arr.get(i);
            if(map.containsKey(val)){
                curr = map.get(val);
            }
            curr.add(i);
            map.put(val,curr);
        }

        for(int i=0;i<n;i++){
            int find = -arr.get(i);
            if(map.containsKey(find)){
                ArrayList<Integer> curr = map.get(find);
                for(int j=0;j<curr.size();j++){
                    if(curr.get(j)>i) {count += curr.size()-j; break;}
                }
            }
        }

        return count;
    }
}
