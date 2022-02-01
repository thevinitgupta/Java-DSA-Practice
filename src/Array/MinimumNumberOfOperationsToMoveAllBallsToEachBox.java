package Array;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] sum = new int[n];
        int f = 0,b=0;
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                f++;
                sum[0] += i;
            }
        }
        if(boxes.charAt(0)=='1'){
            f--;
            b++;
        }
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1] - f + b;
            if(boxes.charAt(i)=='1'){
                f--;
                b++;
            }
        }
        return sum;
    }
}
