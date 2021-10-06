package Strings;

import java.util.*;

public class PartitionLabels {
    //O(N) solution
    public static List<Integer> partitionLabels(String s) {
        List<Integer> li = new ArrayList<>();
        HashMap<Character,Integer> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            charMap.put(ch,i);
        }
        int currStart = 0,currEnd=-1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = charMap.get(ch);
            if(idx>currEnd) currEnd = idx;
            if(i==currEnd){
                int p = (currEnd - currStart) + 1;
                li.add(p);
                currStart=i+1;
            }
        }
        return li;
    }

    public static void main(String[] args) {
        List<Integer> labels = partitionLabels("eccbbbbdec");
        System.out.println(labels);
    }
}
