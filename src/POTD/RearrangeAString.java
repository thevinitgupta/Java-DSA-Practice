package POTD;

import java.util.Arrays;

public class RearrangeAString {
    public String arrangeString(String s)
    {
        char[] str = new char[s.length()];
        int sum = 0;
        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if((int)ch < 58) {
                sum +=(int)ch - 48;
                // str.deleteCharAt(i);
            }
            else {
                str[i] = ch;
            }
            i++;
        }
        Arrays.sort(str);
        return new String(str).trim()+sum;
    }
}
