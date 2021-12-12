package Contests.WeeklyContests;

import java.util.HashMap;
import java.util.HashSet;

public class RingsAndRods {
    public int countPoints(String rings) {
        HashMap<Character, HashSet<Character>> rods = new HashMap<>();
        int i=0,j=1;
        while(j<rings.length()){
            char ring = rings.charAt(i);
            char rod =rings.charAt(j);
            HashSet<Character> r = new HashSet<>();
            if(rods.containsKey(rod)){
                r=rods.get(rod);
                //r.add(ring);
            }
            r.add(ring);
            rods.put(rod,r);
            i=i+2;
            j=j+2;
        }
        int count=0;
        for(i=0;i<=9;i++){
            char k =(char)(i+'0');
            if(rods.containsKey(k) && rods.get(k).size()==3) count++;
        }
        return count;
    }
}
