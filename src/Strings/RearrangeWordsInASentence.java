package Strings;

import java.util.*;

public class RearrangeWordsInASentence {
    static HashMap<String,Integer> indexMap = new HashMap<>();
    public static String arrangeWords(String text) {
        text = text.toLowerCase();
        String [] words = text.split(" ");
        for(int i=0;i<words.length;i++){
            indexMap.put(words[i],i);
        }
        words = sort(words);
        text = String.join(" ",words);
        return text.substring(0,1).toUpperCase()+text.substring(1);
    }
    public static String[] sort(String [] words){
        if(words.length<=1){
            return words;
        }
        int mid = words.length/2;
        String [] left = Arrays.copyOfRange(words,0,mid);
        String [] right = Arrays.copyOfRange(words,mid,words.length);
        return merge(sort(left),sort(right));
    }
    public static String [] merge(String []a,String [] b){
        int i=0,j=0,k=0;
        String [] merged = new String[a.length + b.length];
        while(i<a.length && j<b.length){
            if(a[i].length()<b[j].length()){
                merged[k] = a[i];
                i++;
            }
            else if(a[i].length()>b[j].length()) {
                merged[k] = b[j];
                j++;
            }
            else {
                if(indexMap.get(a[i])<indexMap.get(b[j])) {
                    merged[k] = a[i];
                    i++;
                }
                else {
                    merged[k] = b[j];
                    j++;
                }
            }
            k++;
        }
        while(i<a.length){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        String sorted = arrangeWords("Keep calm and code on");
        System.out.println(sorted);
    }
}
