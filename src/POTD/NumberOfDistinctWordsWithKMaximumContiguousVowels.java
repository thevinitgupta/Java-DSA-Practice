package POTD;

public class NumberOfDistinctWordsWithKMaximumContiguousVowels {
    public int kvowelwords(int N,int K){
        // code here
        double[][] dp = new double[N+1][K+1];
        double MOD = 1e9;
        MOD = MOD + 7;
        for(int i =0;i <= N;i++){

            for(int j = 0;j <= K;j++){
                if(i == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][K]*21%MOD;

                    if(j > 0){
                        dp[i][j] = (dp[i][j] + dp[i-1][j-1]*5%MOD) % MOD;
                    }
                }

            }

        }
        return (int)dp[N][K];
    }
}
