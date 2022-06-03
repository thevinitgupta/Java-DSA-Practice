package POTD;

import java.util.ArrayList;

public class TrickySubsetProblem {
    static int isPossible(long S, int N, long X, long A[])
    {
        // code here
        ArrayList<Long> temp=new ArrayList<>();
        temp.add(S);
        long sum=0;
        long runningsum=0;
        temp.add(S+A[0]);
        runningsum=temp.get(0)+temp.get(1);
        for(int i=1;i<N;i++){
            sum=A[i]+runningsum;
            if(sum >X){
                break;
            }
            temp.add(sum);
            runningsum+=sum;
        }
        int res=0;
        for(int i=temp.size()-1;i>=0;i--){
            if(temp.get(i) >X){
                continue;
            }
            else{
                X-= temp.get(i);
            }
            if(X==0){
                return 1;
            }
        }
        return res;
    }
}
