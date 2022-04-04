package Strings;

import java.util.Collections;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> dic) {
        Collections.sort(dic, (a, b)->{
            if(a.length()==b.length()){
                return a.compareTo(b);
            }
            return a.length()-b.length();
        });

        int n = dic.size(), m = s.length();
        String max = delComp(s,dic.get(n-1)) ? dic.get(n-1) : "";
        boolean found = max.length()!=0;
        for(int i=n-2;i>=0;i--){
            if(found){
                while(i>=0 && dic.get(i).length() == max.length()){
                    max = delComp(s,dic.get(i))? dic.get(i) : max;
                    i--;
                }
                return max;
            }
            if(delComp(s,dic.get(i))) {
                max = dic.get(i);
                found = true;
            }
        }
        return max;
    }
    public static boolean delComp(String a, String b){
        int k = 0, j = 0,m = a.length(), l = b.length();
        while(k<m && j<l){
            while(k<m && a.charAt(k)!=b.charAt(j)) k++;
            if(k>=m) break;
            k++;
            j++;
        }
        return j>=l;
    }
}
