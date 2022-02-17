package Contests.WeeklyContests;

public class MinimumMovesToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int [] sum = new int[boxes.length()];
        int f = 0, b=0;
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                f++;
                sum[0] += i;
            }
        }
        if(boxes.charAt(0)=='1'){
            f--;
            b++;
        }
        for(int i=1;i<boxes.length();i++){
            sum[i] = sum[i-1] -f + b;
            if(boxes.charAt(i)=='1'){
                f--;
                b++;
            }
        }
        return sum;
    }
}
