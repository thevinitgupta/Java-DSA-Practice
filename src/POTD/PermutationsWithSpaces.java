package POTD;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationsWithSpaces {
    ArrayList<String> permutation(String S){
        ArrayList<String> strs = new ArrayList<>();
        strs.add(S);
        strs = perms(S,strs,S.length()-1);
        Collections.sort(strs);
        return strs;
    }
    public static ArrayList<String> perms(String s, ArrayList<String> arr, int pos){
        if(pos<1) return arr;
        String curr = s.substring(0,pos)+" "+s.substring(pos);
        arr.add(0,curr);
        arr = perms(s,arr,pos-1);
        arr = perms(curr,arr,pos-1);
        return arr;
    }
}
