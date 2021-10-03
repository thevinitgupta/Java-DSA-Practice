package Strings;

import java.util.Arrays;

public class LongestPalindromicSubstring {
    static String longestPalindrome(String S){
        // code here
        String palin = "";
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                String sub = S.substring(i,j);
                String rev = reverse(sub);
                if(sub.equalsIgnoreCase(rev) && sub.length()>palin.length()) palin  = sub;
            }
        }
        return palin;
    }
    static String reverse(String s){
        if(s.length()<=1) return s;
        int i=0,j=s.length()-1;
        char [] ch = s.toCharArray();
        System.out.println("Sub String Arr : "+String.valueOf(ch));
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Sub String Arr : "+String.valueOf(ch));
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String longestPalind = longestPalindrome("aaaabbaa");
        System.out.println(longestPalind);
    }
}
