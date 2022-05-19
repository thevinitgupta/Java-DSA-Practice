package InfyTQPrep;

import java.util.HashMap;

public class UniquePaths {

    //TLE
    public int uniquePathsRecursive(int m, int n) {
        HashMap<String,Boolean> map = new HashMap<>();
        getPaths(0,0,m,n,map,"00");
        int c = 0;
        for(String key : map.keySet()){
            c++;
        }
        return c;
    }
    public static void getPaths(int i, int j, int m, int n, HashMap<String,Boolean> map , String s){
        if(i>=m || j>=n) return;
        s+=i;
        s+=j;
        if(i==m-1 && j==n-1) {
            if(!map.containsKey(s)) map.put(s,true);
            return;
        }
        getPaths(i+1,j,m,n,map,s);
        getPaths(i,j+1,m,n,map,s);
        return;
    }

}
