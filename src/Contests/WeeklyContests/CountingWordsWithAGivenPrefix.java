package Contests.WeeklyContests;

public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0,k = pref.length();
        for(int i =0;i<words.length;i++){
            if(words[i].length()>= k && words[i].substring(0,k).equals(pref)) count++;
        }
        return count;
    }
}
