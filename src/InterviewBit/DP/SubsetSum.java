package InterviewBit.DP;

import java.util.ArrayList;

public class SubsetSum {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        boolean [][] dp = new boolean[n+1][B+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=B;j++){
                if(A.get(i-1)<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-A.get(i-1)];
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][B] ? 1 : 0;
    }
}
