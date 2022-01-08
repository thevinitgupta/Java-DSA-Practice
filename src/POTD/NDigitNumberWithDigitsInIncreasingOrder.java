package POTD;

import java.util.ArrayList;

public class NDigitNumberWithDigitsInIncreasingOrder {
    static ArrayList<Integer> increasingNumbers(int N){
        ArrayList<Integer> nums = new ArrayList<>();
        if(N==1){
            for(int i=0; i<10; i++)
                nums.add(i);
        }

        if(N>1)formNums(0, 0, N, nums);
        return nums;
    }

    static void formNums(int num, int nodsf, int n, ArrayList<Integer> nums){
        if(nodsf==n){
            nums.add(num);
            return;
        }

        for(int i=(num%10+1); i<10; i++)
            formNums(num*10+i, nodsf+1, n, nums);
    }

}
