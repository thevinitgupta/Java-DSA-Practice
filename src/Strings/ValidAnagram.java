package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int [] vals = new int[26];
        Arrays.fill(vals,0);
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-97;
            vals[idx]++;
        }
        for(int i=0;i<t.length();i++){
            int idx = t.charAt(i)-97;
            vals[idx]--;
        }
        for (int val : vals) {
            if (val != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean anagrams = isAnagram("","nagaram");
        System.out.println("anagram and nagaram are Anagrams : "+anagrams);
    }
}
