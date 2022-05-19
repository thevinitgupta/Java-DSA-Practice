package InfyTQPrep;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int [][] dp = new int[m][n];
        return getPaths(0,0,m,n,grid,dp);
    }
    public static int getPaths(int i, int j, int m ,int n, int [][] grid, int [][]dp){
        if(i>=m || j>=n) return 0;
        if(grid[i][j]==1) {
            dp[i][j] = -1;
            return 0;
        }
        if(dp[i][j]!=0 && dp[i][j]!=-1) return dp[i][j];

        if(i==m-1 && j==n-1) return 1;
        dp[i][j] = getPaths(i+1,j,m,n,grid,dp) + getPaths(i,j+1,m,n,grid,dp);
        return dp[i][j];
    }
}
