package InterviewBit.Arrays;

import java.util.ArrayList;

public class PrettyPrint {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int k = A;
        int f = 0, l = A*2 -1, i =f,j=f;
        int [][] mat = new int[l][l];
        l--;
        while(k>=1){
            i=f;j=f;
            while(j<=l){
                mat[i][j] = k;
                j++;
            }
            j=l;
            i=f+1;
            while(i<=l){
                mat[i][j] = k;
                i++;
            }
            j=l-1;
            i=l;
            while(j>=f){
                mat[i][j] = k;
                j--;
            }
            i=l-1; j=f;
            while(i>f){
                mat[i][j] = k;
                i--;
            }
            f++;
            l--;
            k--;
        }
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(i=0;i<mat.length;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(j=0;j<mat[0].length;j++){
                row.add(mat[i][j]);
            }
            matrix.add(row);
        }
        return matrix;
    }
}
