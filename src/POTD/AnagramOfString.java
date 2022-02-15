package POTD;

public class AnagramOfString {
    public int remAnagrams(String s,String s1)
    {
        int [] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-97]++;
        }
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-97]--;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            count += Math.abs(hash[i]);
        }
        return count;
    }
}
