package InterviewBit.Strings;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String A) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int i=0,val = 0;
        while(i<A.length()){
            String sub = A.substring(i,Math.min(i+2,A.length()));
            if(map.containsKey(sub)){
                val += map.get(sub);
                i++;
            }
            else {
                val += map.get(A.charAt(i)+"");
            }
            i++;
        }
        return val;
    }
}
