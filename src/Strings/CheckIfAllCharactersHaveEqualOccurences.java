package Strings;

public class CheckIfAllCharactersHaveEqualOccurences {
    public boolean areOccurrencesEqual(String s) {
        int [] c = new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        int count = -1;
        for(int i=0;i<26;i++){
            if(c[i]>0) {
                if(count!=-1 && c[i]!=count) return false;
                count = c[i];
            }
        }
        return true;
    }
}
