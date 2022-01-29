package POTD;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAGivenString {
    String reverseWords(String S)
    {
        // code here
        List<String> words = new ArrayList<>();
        int i=0,j=0,n = S.length();
        while(i<n && j<n){
            if(S.charAt(j)=='.') {
                words.add(S.substring(i,j));
                i=j+1;
                j=i;
            }
            else j++;
        }
        words.add(S.substring(i,n));

        String str = "";
        for(i=words.size()-1;i>=0;i--){
            str += words.get(i);
            if(i>0) str += ".";
        }
        return str;
    }
}
