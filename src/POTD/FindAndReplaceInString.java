package POTD;

import java.util.HashMap;

public class FindAndReplaceInString {
    static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
        class Pair{
            String src,targ;
            Pair(String s, String t){
                this.src = s;
                this.targ = t;
            }
        }
        int skip = 0;
        HashMap<Integer, Pair> map = new HashMap<>();

        for(int i=0;i<Q;i++){
            String curr = S.substring(index[i], index[i] + sources[i].length());

            if(curr.equals(sources[i])){
                map.put(index[i], new Pair(sources[i],targets[i]));
            }
        }

        String str = "";
        for(int i=0;i<S.length();i++){
            if(map.containsKey(i)){
                str += map.get(i).targ;
                i += map.get(i).src.length()-1;
            }
            else str += S.charAt(i);
        }
        return str;
    }
}
