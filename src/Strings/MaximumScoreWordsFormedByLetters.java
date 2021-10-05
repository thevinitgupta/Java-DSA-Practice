package Strings;

import java.util.HashMap;

public class MaximumScoreWordsFormedByLetters {
    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int maxScore = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(String word : words){
            for (int i=0;i<word.length();i++){
                char letter = word.charAt(i);
                if(!map.containsKey(letter)){
                    int val = letter - 'a';
                    map.put(letter,score[val]);
                }
            }
        }

        return maxScore;
    }
}
