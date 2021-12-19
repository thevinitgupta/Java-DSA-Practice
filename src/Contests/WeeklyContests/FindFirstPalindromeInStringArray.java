package Contests.WeeklyContests;

public class FindFirstPalindromeInStringArray {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(checkPalindrome(words[i])) return words[i];
        }
        return "";
    }
    static boolean checkPalindrome(String s){
        //StringBuilder str = new StringBuilder(s);
        //StringBuilder rev = str.reverse();
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
