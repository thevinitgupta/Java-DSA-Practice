package Strings;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String [] str = s.split("\\s+");
        StringBuilder st = new StringBuilder();
        int j=str.length-1;
        while(j>=0){
            if(str[j].length()>0) {
                st.append(str[j]);
                st.append(" ");
            }
            j--;
        }
        return st.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the  sky is   blue "));
    }
}
