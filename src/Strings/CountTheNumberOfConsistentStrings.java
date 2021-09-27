package Strings;

/*
* Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
* */

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int [] alls = new int[26];
        for(int i=0;i<allowed.length();i++){
            int idx = allowed.charAt(i) - 'a';
            alls[idx]++;
        }
        int count = 0;
        for (String word : words) {
            boolean f = true;
            for(int j =0;j<word.length();j++){
                int l = word.charAt(j) - 'a';
                if(alls[l]==0) {
                    f = false;
                    break;
                }
            }
            if(f) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String [] strs = {"cc","acd","b","ba","bac","bad","ac","d"};
        int cStrings = countConsistentStrings("cad",strs);
        System.out.println("No. of Strings : "+cStrings);
    }
}
