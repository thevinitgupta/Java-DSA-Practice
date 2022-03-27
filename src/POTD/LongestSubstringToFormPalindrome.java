package POTD;

import java.util.*;

public class LongestSubstringToFormPalindrome {
    static int longestSubstring(String S) {
        int [] hash = new int[26];
        for(int i=0;i<S.length();i++){
            hash[S.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]%2!=0) odd++;
        }
        //if(odd<=1) return S.length();
        return check(S,hash, odd);
    }
    public static int check(String s, int [] hash, int odd){
        int n = s.length();
        // System.out.println(s);
        // System.out.println(Arrays.toString(hash));
        if(n<=1) return n;
        if(odd<=1) return n;
        char f = s.charAt(0), l = s.charAt(n-1);
        int [] hf = Arrays.copyOfRange(hash, 0, hash.length);
        hf[f-'a']--;
        hash[l-'a']--;
        int fL = check(s.substring(1), hf, (hf[f-'a'])%2==0 ? odd-1 : odd+1);
        int lL =check(s.substring(0,n-1), hash, (hash[l-'a'])%2==0 ? odd-1 : odd+1 );
        return Math.max(fL, lL);
    }
}
