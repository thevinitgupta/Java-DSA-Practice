package Strings;

import Trees.TrieNode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String pref = getPrefix(strs[0], strs[1]);
        if(pref.length()==0) return pref;
        for(int i=2;i<strs.length;i++){
            pref = getPrefix(pref,strs[i]);
            if(pref.length()==0) return "";
        }
        return pref;
    }
    public static String getPrefix(String s1, String s2){
        int l1 = s1.length(), l2 = s2.length(), i=0;
        if(l1==0 || l2==0) return "";

        while(i<l1 && i<l2 && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }

    public static String getPrefix(TrieNode root){
        int count = 0,cCount = 0,last = 0;
        TrieNode crawler = root.root;
        String str = "";
        for(int i=0;i<256;i++){
            if(crawler.children[i]!=null) {
                if(cCount>0) return str;
                last = i;
                cCount++;
            }
        }
        str += (char)last;
        crawler = crawler.children[last];
        count++;
        while(crawler.terminal==false){
            cCount=0;
            for(int i=0;i<256;i++){
                if(crawler.children[i]!=null) {
                    if(cCount>0) return str;
                    cCount++;
                    last = i;
                }
            }
            str += (char)last;
            crawler = crawler.children[last];
            count++;
        }
        return str;
    }
//    public static String prefixString(int level, TrieNode root){
//        TrieNode crawler = root.root;
//        String prefix = "";
//        while(level>0){
//            int last = 0;
//            for(int i=0;i<256;i++){
//                if(crawler.children[i]!=null) {
//                    prefix += (char)i;
//                    last = i;
//                    break;
//                }
//            }
//            crawler = crawler.children[last];
//            level--;
//        }
//        return prefix;
//    }
    public static void main(String[] args) {
        String [] words = {"flow","flower","float"};
        TrieNode pre = new TrieNode();
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]+" => inserted? "+pre.insert(words[i]));
        }
        System.out.println(getPrefix(pre));
    }
}
