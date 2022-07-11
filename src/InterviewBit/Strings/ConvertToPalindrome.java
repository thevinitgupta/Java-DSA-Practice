package InterviewBit.Strings;

public class ConvertToPalindrome {
    public int solve(String A) {
        return check(A,0,A.length()-1, false);
    }
    public static int check(String A, int low, int high, boolean removed){
        if(low>=high) return 1;
        if(A.charAt(high)==A.charAt(low)) return check(A,low+1,high-1,removed);
        else {
            if(removed) return 0;
            else return Math.max(check(A,low,high-1,true),check(A,low+1,high,true));
        }
    }
}
