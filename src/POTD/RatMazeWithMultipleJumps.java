package POTD;

public class RatMazeWithMultipleJumps {
    public int[][] ShortestDistance(int[][] matrix)
    {
        // Code here
        int m= matrix.length;
        int n= matrix[0].length;


        if(matrix[0][0]==0 && n!=1){
            int ans[][]={{-1}};
            return ans;
        }
        int ans[][] = new int[m][n];
        if(solver(matrix, ans,0,0)==false){
            ans[0][0]=-1;
            return ans;
        }
        return ans;
    }
    public boolean isValid(int x,int y,int[][] matrix){
        if(x>=matrix.length || y>=matrix[0].length||matrix[x][y]==0){
            return false;
        }
        return true;
    }
    public boolean solver(int[][] matrix,int[][] ans,int i,int j){
        if(i==matrix.length-1 && j==matrix[0].length-1){
            ans[i][j]=1;
            return true;
        }
        if(isValid(i,j,matrix)){
            ans[i][j] = 1;
            for(int k=1;k<=matrix[i][j] && k<matrix.length;k++){
                if(solver(matrix,ans,i,j+k)) return true;
                if(solver(matrix,ans,i+k,j)) return true;
            }
            ans[i][j]=0;
            return false;
        }

        return false;
    }

}
