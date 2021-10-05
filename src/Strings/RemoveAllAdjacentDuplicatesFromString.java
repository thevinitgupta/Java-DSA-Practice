package Strings;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesFromString {
//    public static String removeDuplicates(String s) {
//        if(s.length()<=1) return s;
//        Stack<Character> letters = new Stack<>();
//        letters.push(s.charAt(0));
//        int i=1;
//        while(i<s.length()){
//            if(letters.isEmpty()){
//                letters.push(s.charAt(i));
//            }
//            else if(letters.peek() == s.charAt(i)){
//                letters.pop();
//            }
//            else {
//                letters.push(s.charAt(i));
//            }
//            i++;
//        }
//        StringBuilder str = new StringBuilder();
//        while(!letters.isEmpty()){
//            str.insert(0,letters.pop());
//        }
//        return str.toString();
//    }
//    static String reverseString(String s){
//        if(s.length()<=1) return s;
//        int i=0,j=s.length()-1;
//        char [] ch = s.toCharArray();
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        return String.valueOf(ch);
//    }


    //faster single pass solution
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if ( sb.length() != 0 && sb.charAt(sb.length() - 1) == ch ) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = removeDuplicates("dabbacd");
        System.out.println(str);
    }
}
