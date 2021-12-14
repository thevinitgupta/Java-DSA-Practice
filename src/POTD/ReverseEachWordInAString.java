package POTD;

public class ReverseEachWordInAString {
    String reverseWords(String S)
    {
        // your code here
        StringBuilder str = new StringBuilder();
        S += ".";
        S = " "+S;
        int i=0,n = S.length(),j=1;
        while(j<n){
            if(S.charAt(j)=='.'){
                str.append(reverse(S.substring(i+1,j)));
                if(j!=n-1)
                    str.append(".");
                i=j;
                j=i+1;
            }
            else j++;
        }
        return str.toString();
    }
    static String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            char ch = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,ch);
            i++;
            j--;
        }
        return str.toString();
    }
}
