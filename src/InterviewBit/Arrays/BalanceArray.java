package InterviewBit.Arrays;

import java.util.ArrayList;

public class BalanceArray {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int result = 0;
        int even = 0;
        int odd =0;

        for(int i = 0 ; i < A.size() ; i++){
            if(i%2 == 0)
                even += A.get(i);
            else
                odd += A.get(i);
        }

        int keven = 0;
        int kodd =0;

        for(int i = 0 ; i < A.size() ; i++){
            if(i%2 == 0){
                if((even - (A.get(i)+keven) + kodd) == ((odd-kodd) + keven))
                    result += 1;
                keven += A.get(i);
            }
            else{
                if((odd - (A.get(i)+kodd) + keven) == (kodd + (even-keven)))
                    result += 1;
                kodd += A.get(i);
            }
        }

        return result;
    }
}
