package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    static String sortString(String s){
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        String [] sorted = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            sorted[i] = sortString(strs[i]);
        }
        boolean [] visited = new boolean[strs.length];
        for(int i=0;i<sorted.length;i++){
            List<String> s = new ArrayList<>();
            if(visited[i]) continue;
            s.add(strs[i]);
            visited[i] = true;
            for(int j=i+1;j<sorted.length;j++){
                if(!visited[j] && sorted[i].equals(sorted[j]) ) {
                    s.add(strs[j]);
                    visited[j] = true;
                }
            }
            anagrams.add(s);
        }
        return anagrams;
    }

    public static void main(String[] args) {
        String [] s = {"a"};
        List<List<String>> anagrams = groupAnagrams(s);
        System.out.println(anagrams);
    }
}
