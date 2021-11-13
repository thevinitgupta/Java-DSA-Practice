package LinkedLists;

import java.util.Arrays;
import java.util.HashMap;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int [] warm = new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
            int next = 0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]) {
                    next  = j-i;
                    break;
                }
            }
            warm[i] = next;
        }
        return warm;
    }

    public static void main(String[] args) {
        int [] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
}
