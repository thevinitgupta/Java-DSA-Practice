package InterviewBit.Strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        if(A.size()==0) return "";
        if(A.size()==1) return A.get(0);
        String pre = "";
        int i =0, j = 0;
        String f = A.get(0), s = A.get(1);
        while(i<f.length() && j<s.length() && f.charAt(i)==s.charAt(j)){
            i++; j++;
        }
        pre = f.substring(0,i);
        for(String curr : A.subList(2,A.size())){
            i=0;j=0;
            while(i<pre.length() && j<curr.length() && pre.charAt(i)==curr.charAt(j)){
                i++; j++;
            }
            pre = pre.substring(0,i);
            if(pre.length()==0) return pre;
        }
        return pre;
    }
}
