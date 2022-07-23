package InterviewBit.Mathematics;

import java.util.Arrays;

public class GridUniquePaths {
    public int uniquePaths(int A, int B) {
        if(A==0 || B==0) return 0;
        int [][]dp = new int[A][B];
        for(int i=0;i<A;i++){
            Arrays.fill(dp[i],-1);
        }
        return paths(0,0,A,B,dp);
    }
    public static int paths(int i, int j, int A, int B, int [][]dp){
        if(i>=A || j>=B) return 0;
        if(i==A-1 && j==B-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j] = paths(i+1,j,A,B,dp)+paths(i,j+1,A,B,dp);
        return dp[i][j];
    }
}
