package POTD;

public class SpecialMAtrix {
    int mod = (int) 1e9 + 7;
    public int FindWays(int n, int m, int[][] blocked_cells)
    {
        int matrix[][] = new int[n + 1][m + 1];
        for (int i = 0; i < blocked_cells.length; i++) {
            matrix[blocked_cells[i][0]][blocked_cells[i][1]] = 1;
        }
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(n, m, matrix, dp);
    }
    public int solve(int i, int j, int matrix[][], int dp[][]) {
        if (matrix[i][j] == 1)
            return 0;
        if (i == 1 && j == 1)
            return 1;
        if (i < 1 || j < 1)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j] % mod;
        else {
            int left = solve(i, j - 1, matrix, dp)% mod;
            int right = solve(i - 1, j, matrix, dp)% mod;
            return dp[i][j] = (left + right)% mod ;
        }
    }

}
