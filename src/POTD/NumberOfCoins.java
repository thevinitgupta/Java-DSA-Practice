package POTD;

public class NumberOfCoins {
    int[][] dp = new int[0][0];
    public int minCoins(int coins[], int M, int V) {
        int val = minOfCoins(coins, M, V);
        if (val >= 1000 * 1000)
            return -1;
        return val;
    }
    public int minOfCoins(int coins[], int M, int V)
    {
        if (dp.length == 0) {
            dp = new int[M + 1][V + 1];

            for (int i = 0; i <= M; i++)
                for (int j = 0; j <= V; j++)
                    dp[i][j] = -1;
        }
        // Your code goes here
        if (V == 0)
            return 0;
        if (M == 0)
            return 1000 * 1000;
        if (dp[M - 1][V] == -1)
            dp[M - 1][V] = minOfCoins(coins, M - 1, V);
        if (coins[M - 1] > V){
            return dp[M - 1][V];
        }
        if (dp[M][V - coins[M - 1]] == -1)
            dp[M][V - coins[M - 1]] = minOfCoins(coins, M, V - coins[M - 1]);

        return Math.min(1 + dp[M][V - coins[M - 1]], minOfCoins(coins, M - 1, V));
    }
}
