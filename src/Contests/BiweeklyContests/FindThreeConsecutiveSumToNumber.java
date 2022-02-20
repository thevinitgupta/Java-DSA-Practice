package Contests.BiweeklyContests;

public class FindThreeConsecutiveSumToNumber {
    public long[] sumOfThree(long num) {
        if(num%3!=0) return new long[]{};
        long lo = num/3;
        return new long[]{lo-1,lo,lo+1};
    }
}
