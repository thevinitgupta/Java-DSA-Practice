package POTD;

import java.util.HashMap;

public class QueriesOnStrings {
    public int[] SolveQueris(String str, int[][] Query)
    {
        HashMap<Character,Integer> o1 = new HashMap<>();
        int a[]= new int[Query.length];
        for(int i=0;i<Query.length;i++){
            o1.clear();
            for(int j=Query[i][0]-1;j<Query[i][1];j++){
                o1.put(str.charAt(j),j);
            }
            a[i]=o1.size();
        }
        return a;
    }
}
