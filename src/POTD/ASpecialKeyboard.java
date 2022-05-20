package POTD;

public class ASpecialKeyboard {
    static int findTime(String s1 , String s2) {
        int [] hash = new int[26];
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-'a'] = i;
        }
        int ptr = 0, count = 0;
        for(int i=0;i<s2.length();i++){
            count += Math.abs(ptr - hash[s2.charAt(i)-'a']);
            ptr = hash[s2.charAt(i)-'a'];
        }
        return count;
    }
}
