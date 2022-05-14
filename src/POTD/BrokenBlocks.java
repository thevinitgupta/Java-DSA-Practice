package POTD;

import java.util.Arrays;

public class BrokenBlocks {
    public int maxGoldUtil(int x,int y,int[][] matrix, int[][] dp){
        if(y<0||y>=matrix[0].length)return 0;
        if(x==matrix.length-1){
            if(matrix[x][y]==-1)return 0;
            return matrix[x][y];
        }
        if(matrix[x][y]==-1)return 0;
        if(dp[x][y]==-1){

            int a=maxGoldUtil(x+1,y,matrix,dp);
            int b=maxGoldUtil(x+1,y-1,matrix,dp);
            int c=maxGoldUtil(x+1,y+1,matrix,dp);
            dp[x][y]= Math.max(a,Math.max(b,c))+matrix[x][y];
        }
        return dp[x][y];
    }
    public int MaxGold(int[][] matrix)
    {
        // Code here
        int result=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);

        for(int i=0;i<n;i++){
            result=Math.max(result,maxGoldUtil(0,i,matrix,dp));
        }
        return result;

    }
}
