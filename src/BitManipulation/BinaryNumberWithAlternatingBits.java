package BitManipulation;

public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        while(n!=0){
            int rem = n%2;
            if(prev!=-1 && rem==prev) return false;
            prev = rem;
            n = n>>1;
        }
        return true;
    }
}
