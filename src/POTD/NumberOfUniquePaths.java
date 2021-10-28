package POTD;

public class NumberOfUniquePaths {
    public static int NumberOfPath(int a, int b)
    {
        int[][] matrix = new int[a][b];
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                if(i==0||j==0) { // i-only from left, j-only from top
                    matrix[i][j]=1;
                }else {
                    matrix[i][j] = matrix[i][j-1]+matrix[i-1][j];//left+top
                }
            }
        }
        return matrix[a-1][b-1];
    }

    public static void main(String[] args) {
        System.out.println(NumberOfPath(2,5));
    }
}
