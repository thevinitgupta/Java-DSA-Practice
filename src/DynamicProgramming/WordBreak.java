package DynamicProgramming;

import java.util.HashMap;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> wordMap = new HashMap<>();
        for(int i = 0;i<wordDict.size();i++){
            wordMap.put(wordDict.get(i), true);
        }
        return getWord(s,0,wordMap);
    }
    public static boolean getWord(String s, int pos, HashMap<String, Boolean> map){
        if(pos>=s.length()) return true;
        //System.out.println(pos);
        for(int i=1;pos+i<=s.length();i++){
            //System.out.println(s.substring(pos,pos+i));
            if(map.containsKey(s.substring(pos,pos+i)) && getWord(s,pos+i,map)){
                return true;
            }
        }
        return false;
    }
}
