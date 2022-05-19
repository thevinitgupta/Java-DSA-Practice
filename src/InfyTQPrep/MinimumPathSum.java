package InfyTQPrep;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i=1;i<n;i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = (j==0 ? dp[i-1][j] : Math.min(dp[i][j-1],dp[i-1][j])) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
