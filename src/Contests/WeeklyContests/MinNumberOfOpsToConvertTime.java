package Contests.WeeklyContests;

public class MinNumberOfOpsToConvertTime {
    public int convertTime(String current, String correct) {
        int cuh = Integer.parseInt(current.substring(0,2)), cum = Integer.parseInt(current.substring(3));
        int coh = Integer.parseInt(correct.substring(0,2)), com = Integer.parseInt(correct.substring(3));
        int first = cuh*60 + cum, second = coh*60 + com;
        int count = 0;
        int curr = 3;
        int c[] = {1,5,15,60};
        while(first!=second){
            while(curr>=0 && second-first < c[curr]) {
                curr--;
            }
            if(curr<0) break;
            first += c[curr];
            count++;
        }
        return count;
    }
}
