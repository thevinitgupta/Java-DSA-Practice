package DynamicProgramming;

public class MinimumPathSum {
    public int minPathSumRecursiveDP(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        minSum(grid,dp,0,1,m,n);
        minSum(grid,dp,1,0,m,n);
        return dp[m-1][n-1];
    }
    public static void minSum(int [][]grid, int [][]dp, int col, int row, int m, int n){
        if(col<n && row<m){
            if(col==0){
                dp[row][0] = grid[row][0] + dp[row-1][0];
            }
            else if(row==0) {
                dp[0][col] = grid[0][col] + dp[0][col-1];
            }

            else {
                dp[row][col] = Math.min(dp[row][col-1],dp[row-1][col]) + grid[row][col];
            }
        }
        if(row<m-1) minSum(grid,dp,col,row+1,m,n);
        if(col<n-1) minSum(grid,dp,col+1,row,m,n);
    }

}
