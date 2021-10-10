package Strings;

import java.util.*;

public class FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character,Character> charMap = new HashMap<>();
        List<String> matchingPatterns = new ArrayList<>();
        for(String word : words){
            charMap.clear();
            boolean insert = true;
            for (int i = 0; i < word.length(); i++) {
                char l = pattern.charAt(i);
               if(charMap.containsKey(l)) {
                   char mapped = charMap.get(l);
                   if(mapped!=word.charAt(i)){
                       insert = false;
                       break;
                   }
               }
               else {
                   if(charMap.containsValue(word.charAt(i))){
                       insert = false;
                       break;
                   }
                   else charMap.put(l,word.charAt(i));
               }
            }
            if(insert) matchingPatterns.add(word);
        }
        return matchingPatterns;
    }

    public static void main(String[] args) {
        String [] words = {"a","b","c"};
        List<String> matchingPatterns = findAndReplacePattern(words,"a");
        System.out.println(matchingPatterns);
    }
}
