package POTD;

import java.util.ArrayList;

public class EncryptStrings2 {
    static String encryptString(String S){
        // code here
        int i=0,j=0;
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> freq = new ArrayList<>();
        while(j<S.length()){
            int curr = 0;
            while(j<S.length() && S.charAt(i)==S.charAt(j)){
                curr++;
                j++;
            }
            chars.add(S.charAt(i));
            freq.add(curr);
            i = j;
        }
        String res="";
        for(i=freq.size()-1;i>=0;i--){
            String hex = Integer.toHexString(freq.get(i));
            res += hex+chars.get(i);
        }
        return res;
    }
}
