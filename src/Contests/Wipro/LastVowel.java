package Contests.Wipro;

import java.util.ArrayList;
import java.util.Locale;

public class LastVowel {
    public static String findStringVowelAndLast(int input1, String[] input2){
        String str = "";
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=0;i<input1;i++){
            String curr = input2[i].toLowerCase();
            if(vowels.contains(curr.charAt(0)) && vowels.contains(curr.charAt(curr.length()-1))){
                str += curr;
            }
        }
        return str.length()==0 ? "no matches found" : str;
    }

    public static void main(String[] args) {
        System.out.println(findStringVowelAndLast(3, new String[]{"Oreo","strish","apple"}));
    }
}
