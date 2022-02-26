package Strings;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder(word);
        int st = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch) {
                st = i;
                break;
            }
        }
        reverse(str,0,st);
        return str.toString();
    }
    public static void reverse(StringBuilder word, int low, int high){
        while(low<high){
            char ch = word.charAt(low);
            word.setCharAt(low, word.charAt(high));
            word.setCharAt(high,ch);
            low++;
            high--;
        }
    }
}
