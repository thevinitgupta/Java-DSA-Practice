package POTD;

public class ComputeBeforeMatrix {
    public int[][] computeBeforeMatrix(int N, int M,int[][] after ){
        int a[][]=new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(i==0 && j==0)
                    a[0][0]=after[0][0];
                if(i==0&&j!=0)
                    a[i][j]=after[i][j]-after[i][j-1];
                if(j==0&&i!=0)
                    a[i][j]=after[i][j]-after[i-1][j];
                if(i!=0&&j!=0)
                    a[i][j]=after[i][j]+after[i-1][j-1]-after[i][j-1]-after[i-1][j];
            }
        }
        return a;
    }
}
