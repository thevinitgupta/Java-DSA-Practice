package POTD;

public class MatrixOperations {
    static int [] endPoints(int [][]arr, int m, int n){
        int i=0,j=0;
        String prev = "R";
        while(i>=0 && i<m && j>=0 && j<n){
            if(arr[i][j]==0) {
                if(prev.equals("R")) j++;
                else if(prev.equals("L")) j--;
                else if (prev.equals("U")) i--;
                else i++;
            }
            else {
                if(prev.equals("R")) prev="D";
                else if(prev.equals("L")) prev="U";
                else if (prev.equals("U")) prev="R";
                else prev="L";
                arr[i][j]=0;
            }
        }
        if(i>=m) i--;
        else if(i<0) i++;
        if(j<0) j++;
        else if(j>=n) j--;
        return new int[]{i,j};
    }
}
