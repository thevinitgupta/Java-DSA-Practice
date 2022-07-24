package InterviewBit.BitManipulation;

public class TrailingZeroes {
    public int solve(int A) {
        int count=0;
        for(int i=0;i<32;i++){
            if(((A>>i)&1)==1) break;
            count++;
        }
        return count;
    }
}
