package Strings;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)-97]--;
        }
        char ret='a';
        for(int i=0;i<26;i++){
            if(hash[i]!=0) {
                ret = (char)(97+i);
            }
        }
        return ret;
    }
}
