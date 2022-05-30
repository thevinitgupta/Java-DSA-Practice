package POTD;

public class LongestPathInMatrix {
    private Integer[][] dp;
    private boolean[][] visited;
    private int maxPath;

    public int longestIncreasingPath(int[][] matrix) {
        // Code here
        int m = matrix.length;
        int n = matrix[0].length;

        dp = new Integer[m][n];
        visited = new boolean[m][n];

        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (!visited[i][j]) {
                    dfs(matrix, i, j, -1);
                }
            }
        }

        return maxPath;
    }

    private int dfs(int[][] matrix, int row, int col, int prevVal) {
        if (row < 0 || row == matrix.length || col < 0 || col == matrix[0].length || prevVal >= matrix[row][col]) {
            return 0;
        }

        if (dp[row][col] != null) {
            return dp[row][col];
        } else {
            visited[row][col] = true;
        }

        int u = dfs(matrix, row-1, col, matrix[row][col]);
        int r = dfs(matrix, row, col+1, matrix[row][col]);
        int d = dfs(matrix, row+1, col, matrix[row][col]);
        int l = dfs(matrix, row, col-1, matrix[row][col]);

        dp[row][col] = 1 + Math.max(u, Math.max(r, Math.max(d, l)));
        maxPath = Math.max(maxPath, dp[row][col]);

        return dp[row][col];
    }

}
