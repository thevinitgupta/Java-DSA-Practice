package InterviewBit.Mathematics;

public class StepByStep {
    public int solve(int A) {
        A = Math.abs(A);
        int step = 0;
        int num = 0;

        while(num < A)
        {
            step++;
            num += step;
        }

        while((A - num) % 2 != 0)
        {
            step++;
            num += step;
        }

        return step;
    }
}
