package InterviewBit.Arrays;

import java.util.ArrayList;

public class SpiralOrderMatrix2 {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int f = 0, l = A-1,k = 1, i=0,j=0;
        int [][] mat = new int[A][A];
        while(k<=A*A){
            i=f;
            j=f;
            while(j<=l){
                mat[i][j] = k++;
                j++;
            }
            i++;
            j = l;
            while(i<=l){
                mat[i][j] = k++;
                i++;
            }
            j=l-1;
            i=l;
            while(j>=f){
                mat[i][j] = k++;
                j--;
            }
            j=f;
            i=l-1;
            while(i>f){
                mat[i][j] = k++;
                i--;
            }
            f++;
            l--;
        }
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(i=0;i<A;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(j=0;j<A;j++){
                row.add(mat[i][j]);
            }
            matrix.add(row);
        }
        return matrix;
    }
}
