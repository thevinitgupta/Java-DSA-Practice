package InterviewBit.BitManipulation;

import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int xor = 0;
        for(int i=0;i<A.size();i++){
            xor ^= A.get(i);
        }
        return xor;
    }
}
