package InterviewBit.Mathematics;

public class ReverseInteger {
    public int reverse(int A) {
        long rev = 0, copy = Math.abs(A);
        while(copy>0){
            long d = copy%10;
            rev = rev*10+d;
            copy = copy/10;
        }
        if(A<0) return rev>Integer.MAX_VALUE-1 ? 0 : 0-(int)rev;
        return rev>Integer.MAX_VALUE? 0 : (int)rev;
    }
}
