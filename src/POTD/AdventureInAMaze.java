package POTD;

public class AdventureInAMaze {
    public int[] FindWays(int[][] matrix)
    {
        // Code here
        Integer[][] dp=new Integer[matrix.length][matrix[0].length];
        Integer[][] dp2=new Integer[matrix.length][matrix[0].length];

        int no=chec(0,0,matrix,dp);
        int n2=chec2(0,0,matrix,dp2);
        return new int[]{no,n2};
    }
    static int chec2(int i,int j,int[][] matrix,Integer[][] dp)
    {
        if(i>=matrix.length||j>=matrix[0].length)
            return 0;
        if(i==matrix.length-1&&j==matrix[0].length-1)
            return matrix[i][j];
        if(dp[i][j]!=null)
            return dp[i][j];
        if(matrix[i][j]==1)
        {
            int g1=chec2(i,j+1,matrix,dp);
            if(g1==0)
                return dp[i][j]=0;
            return dp[i][j]=matrix[i][j]+g1;
        }

        else if(matrix[i][j]==2)
        {
            int g1=chec2(i+1,j,matrix,dp);
            if(g1==0)
                return dp[i][j]=0;
            return dp[i][j]=matrix[i][j]+g1;
        }
        // return matrix[i][j]+chec2(i+1,j,matrix);
        else
        {
            int g1=chec2(i,j+1,matrix,dp);
            int g2=chec2(i+1,j,matrix,dp);
            if(g1==0&&g2==0)
                return dp[i][j]=0;
            else if(g2==0)
                return dp[i][j]=g1+matrix[i][j];
            else if(g1==0)
                return dp[i][j]=g2+matrix[i][j];
            else
                return dp[i][j]=matrix[i][j]+Math.max(g1,g2);
        }
    }
    static int chec(int i,int j,int[][] matrix,Integer[][] dp)
    {
        if(i>=matrix.length||j>=matrix[0].length)
            return 0;
        if(i==matrix.length-1&&j==matrix[0].length-1)
            return 1;
        if(dp[i][j]!=null)
            return dp[i][j];
        if(matrix[i][j]==1)
            return dp[i][j]=chec(i,j+1,matrix,dp)%1000000007;
        else if(matrix[i][j]==2)
            return dp[i][j]=chec(i+1,j,matrix,dp)%1000000007;
        else
            return dp[i][j]=(chec(i,j+1,matrix,dp)%1000000007+chec(i+1,j,matrix,dp)%1000000007)%1000000007;
    }
}
