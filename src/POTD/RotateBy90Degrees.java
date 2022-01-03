package POTD;

public class RotateBy90Degrees {
    static void rotate(int matrix[][])
    {
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
        int cr = n-1;
        //column wise reverse
        while(i<cr){
            j=0;
            while(j<n){
                //System.out.println(i+", "+j);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[cr][j];
                matrix[cr][j] = temp;
                j++;
            }
            i++;
            cr--;
            //System.out.println("i="+i+", cr="+cr);
        }
    }
}
