package DynamicProgramming;

import java.util.HashMap;

public class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashMap<String, Boolean> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                if(map.get(words[i])) count++;
            }
            else if(isSubseq(words[i],s)) {
                map.put(words[i],true);
                count++;
            }
            else map.put(words[i],false);
        }
        return count;
    }
    public static boolean isSubseq(String s, String t){
        int i=0,j=0,m = s.length(),n = t.length();
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i>=m;
    }
}
