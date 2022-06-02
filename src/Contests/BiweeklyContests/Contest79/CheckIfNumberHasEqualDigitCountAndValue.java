package Contests.BiweeklyContests.Contest79;

public class CheckIfNumberHasEqualDigitCountAndValue {
    public boolean digitCount(String num) {
        int [] hash = new int[num.length()];
        for(int i=0;i<num.length();i++){
            int ind = num.charAt(i)-'0';
            if(ind<num.length()) hash[ind]++;
        }
        // System.out.println(Arrays.toString(hash));
        for(int i=0;i<num.length();i++){
            if(hash[i]!=Integer.parseInt(num.charAt(i)+"")) return false;
        }
        return true;
    }
}
