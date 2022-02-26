package Strings;

import Trees.TrieNode;

public class LongestCommonPrefix {
    public static int getPrefix(TrieNode root){
        int count = 0,cCount = 0,last = 0;
        TrieNode crawler = root.root;
        for(int i=0;i<256;i++){
            if(crawler.children[i]!=null) {
                if(cCount>0) return count;
                last = i;
                cCount++;
            }
        }
        crawler = crawler.children[last];
        count++;
        while(crawler.terminal==false){
            cCount=0;
            for(int i=0;i<256;i++){
                if(crawler.children[i]!=null) {
                    if(cCount>0) return count;
                    cCount++;
                    last = i;
                }
            }
            crawler = crawler.children[last];
            count++;
        }
        //System.out.println("Count => "+count);
        return count;
    }
    public static String prefixString(int level, TrieNode root){
        TrieNode crawler = root.root;
        String prefix = "";
        while(level>0){
            int last = 0;
            for(int i=0;i<256;i++){
                if(crawler.children[i]!=null) {
                    prefix += (char)i;
                    last = i;
                    break;
                }
            }
            crawler = crawler.children[last];
            level--;
        }
        return prefix;
    }
    public static void main(String[] args) {
        String [] words = {"flow","flower","float"};
        TrieNode pre = new TrieNode();
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]+" => inserted? "+pre.insert(words[i]));
        }
        System.out.println(prefixString(getPrefix(pre),pre));
    }
}
