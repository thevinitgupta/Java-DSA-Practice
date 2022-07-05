package InterviewBit.BitManipulation;

public class CountTotalSetBits {
    public int solve(int A) {
        long count=0;
        long num = 1;
        long mod = 1000000007;
        while(A>=num) {
            int bkt = (int)(A/num) ;
            long prev = A/(num*2);
            if(bkt%2 == 1){
                count+= prev*num + A%num + 1;
            }
            else {
                count+= prev*num;
            }
            num *= 2;
        }
        return (int)(count%mod);
    }
}
