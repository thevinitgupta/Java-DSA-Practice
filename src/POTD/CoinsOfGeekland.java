package POTD;

public class CoinsOfGeekland {
    public int Maximum_Sum(int mat[][],int N,int k){
        int [][]sum = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                sum[i][j] = sum[i][j-1] + mat[i-1][j-1];
            }
        }
        for(int i=1; i<=N; i++){
            for(int j=2; j<=N; j++){
                sum[j][i] += sum[j-1][i] ;
            }
        }
        int max = 0;
        for(int i=k ; i<=N; i++){
            for(int j=k;j<= N; j++){
                int tem = sum[i][j] - sum[i][j-k] - sum[i-k][j] + sum[i-k][j-k];

                max = Math.max(max , tem);
            }
        }
        return max;
    }
}
