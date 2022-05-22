package Contests.WeeklyContests.Contest294;

public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        double c = 0.0d;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter) c++;
        }
        return (int)Math.floor((c*100)/s.length());
    }
}
