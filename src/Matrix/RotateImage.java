package Matrix;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int i=0,j=0,n = matrix.length;

        //transpose of matrix
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                //System.out.println(i+", "+j);
                if(j>=i){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        i=0;j=0;
        //row wise reverse
        while(i<n){
            j=0;
            int cc =n-1;
            while(j<cc){
                //System.out.println(i+", "+j);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cc];
                matrix[i][cc] = temp;
                j++;
                cc--;
            }
            i++;
            //System.out.println("i="+i+", cr="+cr);
        }
    }
}
