package Strings;

import java.util.Arrays;

public class MinNoOfOpsToMoveAllBalls {
    public static int[] minOperations(String boxes) {
        int [] res = new int[boxes.length()];
        int count
        return res;
    }

    //brute force N*N Solution
    /*
    * public static int[] minOperations(String boxes) {
        int [] res = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int tot=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1') {
                    tot += Math.abs(i-j);
                }
            }
            res[i] = tot;
        }
        return res;
    }
    * */

    public static void main(String[] args) {
        int [] moves = minOperations("001011");
        System.out.println(Arrays.toString(moves));
    }
}
