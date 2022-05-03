class SubsetsWithXORValue{
    static int subsetXOR(int arr[], int N, int K) 
    { 
        // Find maximum element in arr[] 
        int max_ele = arr[0]; 
        for (int i=1; i<N; i++) 
          if (arr[i] > max_ele) 
              max_ele = arr[i]; 
        // Maximum possible XOR value 
        int m = 10*max_ele;
            
        int[][] dp = new int[N+1][m+1];
         // The xor of empty subset is 0 
        dp[0][0] = 1;
        // Fill the dp table 
        for(int i=1;i<=N;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] += dp[i-1][j]; 
                if((j^arr[i-1])<=m){
                    dp[i][j] += dp[i-1][j^arr[i-1]];
                }
            }
        }
        return dp[N][K];
    }
}
