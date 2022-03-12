package POTD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckMirrorInNAryTree {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {

        HashMap<Integer, List<Integer>> mapA = new HashMap<>();
        HashMap<Integer, List<Integer>> mapB = new HashMap<>();

        int fa = A[0], fb = B[0];

        if(fa!=fb) return 0;

        for(int i=0;i<A.length;i += 2){
            int val = A[i+1],key = A[i];
            List<Integer> curr = new ArrayList<>();

            if(mapA.containsKey(key)){
                curr = mapA.get(key);
            }

            curr.add(val);
            mapA.put(key,curr);
        }
        for(int i=0;i<B.length;i += 2){

            int val = B[i+1],key = B[i];
            List<Integer> curr = new ArrayList<>();

            if(mapB.containsKey(key)){
                curr = mapB.get(key);
            }

            curr.add(0,val);
            mapB.put(key,curr);
        }

        for(int key : mapA.keySet()){
            if(!check(mapA.get(key), mapB, key)) return 0;
        }

        return 1;
    }
    public static boolean check(List<Integer> la, HashMap<Integer, List<Integer>> mapB, int key){
        if(mapB.containsKey(key)){
            List<Integer> lb = mapB.get(key);
            if(la.size()!=lb.size()) return false;
            for(int i=0;i<la.size();i++){
                if(la.get(i)!=lb.get(i)) return false;
            }
            return true;
        }
        else return false;
    }
}
