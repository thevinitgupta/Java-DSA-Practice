package InterviewBit.Mathematics;

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        if(A>B) return hcf(B,A);
        else return hcf(A,B);
    }
    public static int hcf(int A, int B){
        if(A==0) return B;
        else if(B==0) return A;

        if(A==1 || B==1) return 1;
        return hcf(B,A%B);
    }
}
