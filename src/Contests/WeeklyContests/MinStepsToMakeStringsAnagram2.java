package Contests.WeeklyContests;

public class MinStepsToMakeStringsAnagram2 {
    public int minSteps(String s, String t) {
        int [] hash = new int [26];
        for(int i = 0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<t.length();i++){
            hash[t.charAt(i)-'a']--;
        }
        int count = 0;
        for(int i = 0;i<26;i++){
            // System.out.println((char)(97+i) + " => "+hash[i]);
            count += Math.abs(hash[i]);
        }
        return count;
    }
}
