package Contests.Wipro;

public class DetectiveBakshi {
    public static int calculateKey(int input1, int input2, int input3, int input4, int input5){
        int maxStable = Integer.MIN_VALUE, minUnstable = Integer.MAX_VALUE;
        if(stability(input1)) {
            maxStable = Math.max(maxStable, input1);
            minUnstable = Math.min(minUnstable, input1);
        }

        if(stability(input2)) {
            maxStable = Math.max(maxStable, input1);
            minUnstable = Math.min(minUnstable, input1);
        }

        if(stability(input3)) {
            maxStable = Math.max(maxStable, input1);
            minUnstable = Math.min(minUnstable, input1);
        }

        if(stability(input4)) {
            maxStable = Math.max(maxStable, input1);
            minUnstable = Math.min(minUnstable, input1);
        }

        if(stability(input5)) {
            maxStable = Math.max(maxStable, input1);
            minUnstable = Math.min(minUnstable, input1);
        }

        if(maxStable==Integer.MIN_VALUE) maxStable = 0;
        if(minUnstable==Integer.MAX_VALUE) minUnstable = 0;

        return maxStable+minUnstable;
    }
    public static boolean stability(int n){
        return false;
    }
}
