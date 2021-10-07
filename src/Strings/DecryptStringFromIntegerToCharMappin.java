package Strings;

public class DecryptStringFromIntegerToCharMappin {
    public static String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        int i=0,n = s.length();
        while(i<n){
            if(i+2 < n && s.charAt(i+2)=='#'){
                char l = getCharacter(Integer.parseInt( s.substring(i,i+2)));
                str.append(l);
                i = i+3;
            }
            else {
                str.append(getCharacter(Integer.parseInt(s.charAt(i)+"")));
                i++;
            }
        }
        return str.toString();
    }
    public static char getCharacter(int n){
        String s = "abcdefghijklmnopqrstuvwxyz";
        return s.charAt(n-1);
    }

    public static void main(String[] args) {
        String s = freqAlphabets("10#11#12");
        System.out.println(s);
    }
}
