package Contests.WeeklyContests;

public class AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<spaces.length;i++){
            str.insert(spaces[i]+i," ");
        }
        return str.toString();
    }
}
