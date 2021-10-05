package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistanceToACharacter {
    public static int[] shortestToChar(String s, char c) {
        int [] distances = new int[s.length()];
        List<Integer> pos = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) pos.add(i);
        }
        int f = 0;
        int prev = pos.get(f);
        if(f+1<pos.size()) f++;
        int next = pos.get(f);
        f++;
        for(int i=0;i<s.length();i++){
            distances[i] = Math.min(Math.abs(i-prev),Math.abs(i-next));
            if(i>=next){
                if(f<pos.size()){
                    prev = next;
                    next = pos.get(f);
                    f++;
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int [] d = shortestToChar("b",'b');
        System.out.println(Arrays.toString(d));
    }
}
