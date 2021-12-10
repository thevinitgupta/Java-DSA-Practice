package Strings;

import java.util.Arrays;

public class LongestPalindromicSubstring {

    //leetcode Q-5 incomplete recursive solution
    public String longestPalindromeSubstring(String s) {
        int n = s.length();
        if(n<=1) return s;
        int i=n/2 - 1,j=n/2;
        String sub = s.substring(i,j);
        if(n%2!=0) {
            i=j;
        }
        while(i>=0 && j<n){
            //System.out.println(i+", "+j);
            if(s.charAt(i)==s.charAt(j)){
                sub = s.substring(i,j+1);
                //System.out.println(sub);
                i--;
                j++;
            }
            else {
                System.out.println("Not matched at : "+i+", "+j);
                break;
            }
        }
        String lfs = longestPalindromeSubstring(s.substring(0,i+1));
        String rts = longestPalindromeSubstring(s.substring(j,n));

        if(lfs.length() > rts.length() && lfs.length()>sub.length()) {
            sub = lfs;
        }
        else if(rts.length()>lfs.length() && rts.length()>sub.length()){
            sub=rts;
        }
        return sub;
    }
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
