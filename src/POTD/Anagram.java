package POTD;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int m = a.length(),n = b.length();
        if(m!=n) return false;
        for(int i=0;i<m;i++){
            char l = a.charAt(i);
            if(!map.containsKey(l)) map.put(l,1);
            else {
                int count = map.get(l);
                map.put(l,count+1);
            }
        }
        for(int i=0;i<n;i++){
            char l = b.charAt(i);
            if(!map.containsKey(l)) return false;
            else {
                int count = map.get(l);
                if(count==0) return false;
                else map.put(l,count-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","naagaram"));
    }
}
