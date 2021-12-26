package Contests.WeeklyContests;

public class ANumberAfterDoubleReversal {
    public boolean isSameAfterReversals(int num) {
        int sum = 0;
        while(num>0){
            int d = num%10;
            if(sum==0 && d==0) return false;
            sum = sum*10 + d;
            num = num/10;
        }
        return true;
    }
}
