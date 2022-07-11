package InterviewBit.Strings;

import java.util.ArrayList;

public class CharacterFrequencies {
    public ArrayList<Integer> solve(String A) {
        int [] hash = new int[26];
        for(int i=0;i<A.length();i++){
            hash[A.charAt(i)-'a']++;
        }
        ArrayList<Integer> freq = new ArrayList<>();
        for(int i=0;i<A.length();i++){
            if(hash[A.charAt(i)-'a']!=0){
                freq.add(hash[A.charAt(i)-'a']);
                hash[A.charAt(i)-'a']= 0;
            }
        }
        return freq;
    }
}
