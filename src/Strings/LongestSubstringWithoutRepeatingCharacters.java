package Strings;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int [] c = new int[256];
        Arrays.fill(c,-1);
        int i=0,j=0;
        int max = 0;
        while(j<s.length()){
            int l = (int)s.charAt(j);
            if(c[l]!=-1){
                max = Math.max(max,(j-i));
                for(int k=i;k<j;k++){
                    c[(int)s.charAt(k)] = -1;
                }
                i = j;
            }
            else {
                c[l] = j;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max = lengthOfLongestSubstring("abcdeeaaabc");
        System.out.println("Max non repeating : "+max);
    }
}
