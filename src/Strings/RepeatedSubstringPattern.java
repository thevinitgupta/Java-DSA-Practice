package Strings;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int i=0, j = s.length()-1;
        //if((j+1)%2!=0) return false;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                String sub = s.substring(0,i+1),str = "";
                int k = s.length()/sub.length();
                while(k>0) {
                    str += sub;
                    k--;
                }

                if(str.equals(s)) return true;
            }
            i++;
        }
        return false;
    }
}
