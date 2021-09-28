package Strings;

import java.util.HashMap;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> cMap = new HashMap<>();
        for(int i=0;i<jewels.length();i++){
            cMap.put(jewels.charAt(i),1);
        }
        int count= 0;
        for(int j=0;j<stones.length();j++){
            if(cMap.containsKey(stones.charAt(j))) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count = numJewelsInStones("a","AAbbbb");
        System.out.println("Count of Jewels in Stones are : "+count);
    }
}
