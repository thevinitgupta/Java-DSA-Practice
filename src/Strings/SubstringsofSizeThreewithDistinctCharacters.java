package Strings;

public class SubstringsofSizeThreewithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int [] hash = new int[26];
        int i=0,j = 0, count = 0, n = s.length();
        while(i<n && j<n){
            hash[s.charAt(j)-'a']++;
            if((j-i)+1>=3){
                int k = i;
                while(k<=j){
                    if(hash[s.charAt(k)-'a']>1) break;
                    k++;
                }
                if(k>j){
                    count++;
                }
                hash[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return count;
    }
}
