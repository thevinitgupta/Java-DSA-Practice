package Strings;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PrintWordsVertically {

    public static List<String> printVertically(String s) {
        String [] words = s.split(" ");
        List<String> verticals = new ArrayList<>();
        int limit = 0;
        for(String word : words){
            limit = Math.max(limit,word.length());
        }
        int c = 0;
        while(c<limit){
            StringBuilder curr= new StringBuilder();
            for(String word : words){
                if(c<word.length()) curr.append(word.charAt(c));
                else curr.append(" ");
            }
            verticals.add(curr.toString().replaceFirst("\\s++$", ""));
            c++;
        }
        return verticals;
    }

    public static void main(String[] args) {
        List<String> verticals = printVertically("TO BE ORDER NOT TO BE");
        for(int i=0;i<verticals.size();i++){
            System.out.println(verticals.get(i));
        }
    }
}
