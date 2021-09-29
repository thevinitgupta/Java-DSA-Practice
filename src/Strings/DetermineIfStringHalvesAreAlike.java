package Strings;

/*
* You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
* */

import java.util.Locale;

public class DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int c1 = 0, c2 = 0;
        int mid = s.length()/2;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               if(i<mid) c1++;
               else c2++;
           }
        }
        return c1==c2;
    }

    public static void main(String[] args) {
        boolean isEqual = halvesAreAlike("AbCdEfGh");
        System.out.println(isEqual);
    }
}
