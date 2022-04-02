package LeetCodeChallenges.April;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        return valid(s,true);
    }
    public static boolean valid(String s, boolean allowed){
        if(s.length()<=1) return true;
        int i=0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else {
                if(!allowed) return false;
                return valid(s.substring(0,i) + s.substring(i+1), false) || valid(s.substring(0,j) + s.substring(j+1), false);
            }
        }
        return true;
    }
}
