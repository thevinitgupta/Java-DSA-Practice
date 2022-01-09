package POTD;

import java.util.ArrayList;
import java.util.HashMap;

public class PositiveNegativePair {
    public static ArrayList<Integer>findPairs(int arr[], int n)
    {
        // code here.
        HashMap<Integer,Integer> p = new HashMap<>();
        ArrayList<Integer> pairs = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(p.containsKey(arr[i])){
                if(arr[i]<0) {
                    pairs.add(arr[i]);
                    pairs.add(p.get(arr[i]));
                }
                else {
                    pairs.add(p.get(arr[i]));
                    pairs.add(arr[i]);
                }
            }
            else {
                p.put(0-arr[i],arr[i]);
            }
        }
        return pairs;
    }
}
