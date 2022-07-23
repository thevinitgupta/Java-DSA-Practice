package InterviewBit.Mathematics;

import java.util.ArrayList;

public class ArmstrongNumber {
    public int solve(int A) {
        ArrayList<Integer> arr = new ArrayList<>();
        int copy = A;
        while(A>0){
            arr.add(A%10);
            A /= 10;
        }
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            sum += Math.pow(arr.get(i),arr.size());
        }
        return copy==sum?1 : 0;
    }
}
