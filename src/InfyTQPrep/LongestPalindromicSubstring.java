package InfyTQPrep;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String max = "";
        for(int i=0;i<s.length();i++){
            String l1 = expand(s,i,i);
            String l2 = expand(s,i,i+1);

            if(l1.length()>l2.length()) max = l1.length()>max.length() ? l1 : max;
            else max = l2.length()>max.length() ? l2 : max;

        }
        return max;
    }
    public static String expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
