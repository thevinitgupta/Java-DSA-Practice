package InterviewBit.Arrays;

import java.util.ArrayList;

public class MinimumLightsToActivate {
    public int solve(ArrayList<Integer> A, int B) {

        int start = 0;
        int count = 0;

        for(int i=0; i< A.size();){

            int left = i+1-B  <  0?0 : i+1-B;

            int right = i-1+B > A.size()-1 ? A.size()-1 : i-1+B;

            while(right >=0 && right >= i-B+1 && A.get(right) == 0){

                right--;

            }
            if(right < 0 || right < i-B+1){
                return -1;
            }
            count++;
            i += (right + B  - i);

        }
        return count;

    }

}
