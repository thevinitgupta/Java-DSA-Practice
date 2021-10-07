package Strings;

import java.util.Arrays;

public class CustomSortString {
    public static String customSortString(String order, String s) {
        char [] sArr = s.toCharArray();
        int prev = 0;
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            int j=prev,k=prev;
            while(j<s.length()){
                if(sArr[j]==c) {
                    char temp = sArr[k];
                    sArr[k] = sArr[j];
                    sArr[j] = temp;
                    j++;
                    k++;
                }
                else {
                    j++;
                }
            }
            prev = k;
        }
        return String.valueOf(sArr);
    }

    public static void main(String[] args) {
        String sorted = customSortString("cba", "abcdcecba");
        System.out.println(sorted);
    }
}
