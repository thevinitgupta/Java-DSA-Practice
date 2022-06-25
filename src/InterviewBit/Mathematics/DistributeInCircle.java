package InterviewBit.Mathematics;

public class DistributeInCircle {
    public int solve(int A, int B, int C) {
        int rem = A%B;
        int r2 = C+rem-1;
        return r2%B;
    }
}
