package Contests.Wipro;

import java.util.Locale;

public class FormTheWord {
    public static String formTheWord(String input1){
        String [] arr = input1.split(":");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<1) continue;

            char ch1 = arr[i].charAt(0), ch2 = arr[i].charAt(1);
            if(ch1==ch2){
                ans += arr[i].toUpperCase().charAt(0);
            }
            else {
                int c1 = ch1-'a', c2 = ch2-'a';
                int diff = Math.abs(c1-c2) - 1;
                char ch3 = (char) ('A'+diff);
                ans += ch3;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(formTheWord("zx:za:ee"));
    }
}
