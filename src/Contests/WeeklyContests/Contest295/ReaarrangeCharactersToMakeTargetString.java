package Contests.WeeklyContests.Contest295;

import java.util.HashMap;

public class ReaarrangeCharactersToMakeTargetString {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i=0;i<target.length();i++){
            tMap.put(target.charAt(i), tMap.getOrDefault(target.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<target.length();i++){
            char key = target.charAt(i);
            if(!sMap.containsKey(key)) return 0;
            int curr = sMap.get(key)/tMap.get(key);
            min = Math.min(min,curr);
        }
        return min;
    }
}
