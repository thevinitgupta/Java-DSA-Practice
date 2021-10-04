package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character,Integer> charMap = new HashMap<>();
        List<String> matchingPatterns = new ArrayList<>();
        for(int i=0;i<pattern.length();i++){
            char letter = pattern.charAt(i);
            if(charMap.containsKey(letter)) {
                int curr = charMap.get(letter);
                curr++;
                charMap.replace(letter,curr-1,curr);
            }
            else charMap.put(letter,1);
        }
        Integer [] patt = charMap.values().toArray(new Integer[0]);
        Arrays.sort(patt);
        System.out.println(Arrays.toString(patt));
        for(String word : words){
            HashMap<Character,Integer> currMap = new HashMap<>();
            for(int i=0;i<word.length();i++){
                char letter = word.charAt(i);
                if(currMap.containsKey(letter)) {
                    int curr = currMap.get(letter);
                    curr++;
                    currMap.replace(letter,curr-1,curr);
                }
                else currMap.put(letter,1);
            }

            Integer [] currArr = currMap.values().toArray(new Integer[0]);
            System.out.println(Arrays.toString(currArr));
            if(currArr.length==patt.length) {
                boolean matched = true;
                Arrays.sort(currArr);
                for(int j=0;j<currArr.length;j++){
                    if(Integer.parseInt(currArr[j]+"")!=Integer.parseInt(patt[j]+"")) {
                        matched = false;
                        System.out.println(currArr[j]+" -> "+patt[j]);
                        break;
                    }
                }
                if(matched) matchingPatterns.add(word);
            }
        }
        return matchingPatterns;
    }

    public static void main(String[] args) {
        String [] words = {"abc","deq","mee","aqq","dkd","ccc"};
        List<String> matchingPatterns = findAndReplacePattern(words,"abb");
        System.out.println(matchingPatterns);
    }
}
