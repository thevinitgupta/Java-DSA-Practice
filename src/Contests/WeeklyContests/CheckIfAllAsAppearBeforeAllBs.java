package Contests.WeeklyContests;

public class CheckIfAllAsAppearBeforeAllBs {
    public boolean checkString(String s) {
        int n = s.length();
        int indA = -1,indB =n;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='a') indA = i;
            else if(i<indB) indB = i;
        }
        if(indA<indB) return true;
        return false;
    }
}
