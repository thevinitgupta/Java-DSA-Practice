package BitManipulation;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num>0){
            // num>>1 = num/2
            if(num%2==0) num = num>>1;

            // num<<1 = num*2
            else num = ((num << 1) + (~num));
            steps++;
        }
        return steps;
    }
}
