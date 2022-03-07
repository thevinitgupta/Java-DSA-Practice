package Contests.HackWithInfy;

import java.util.ArrayList;
import java.util.List;

public class CheckForPerfectCubeSubarray {
    boolean iscube(int num){
        int ans=(int)(Math.cbrt((double)num));
        return (ans*ans*ans)==num;
    }
    int solve(int N, List<Integer> A) {

        List<Integer> answer = new ArrayList<>();

        int sum=0;

        for(int i=0;i<N;i++){
            sum+=A.get(i);
            answer.add(sum);
        }
        int maximum=N+1;
        for(int i=0;i<N;i++){
            if(iscube(answer.get(i)))
            {
                maximum=Math.min(maximum,i+1);
            }
            for(int j=0;j<i;j++){
                if(iscube(answer.get(i)-answer.get(i))){
                    maximum=Math.min(maximum,i-j);
                }
            }
        }
        if(maximum==N+1)return -1;
        return maximum;
    }
}
