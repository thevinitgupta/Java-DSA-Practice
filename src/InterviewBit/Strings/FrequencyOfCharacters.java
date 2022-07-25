package InterviewBit.Strings;

import java.util.ArrayList;

public class FrequencyOfCharacters {
    public ArrayList<Integer> solve(String A) {
        int [] hash = new int[26];
        for(int i=0;i<A.length();i++){
            hash[A.charAt(i)-'a']++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<26;i++){
            ans.add(hash[i]);
        }
        return ans;
    }
}
