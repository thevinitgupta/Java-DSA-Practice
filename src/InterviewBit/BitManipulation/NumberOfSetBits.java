package InterviewBit.BitManipulation;

public class NumberOfSetBits {
    public int numSetBits(long a) {
        int count = 0;
        while(a!=0){
            count+= (a&1);
            a = a>>1;
        }
        return count;
    }
}
