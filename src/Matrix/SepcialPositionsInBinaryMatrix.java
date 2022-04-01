package Matrix;

public class SepcialPositionsInBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int [] rows = new int[m];
        int [] cols = new int[n];
        for(int i=0;i<m;i++){
            int curr = 0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1) curr++;
            }
            rows[i] = curr;
        }
        for(int j=0;j<n;j++){
            int curr = 0;
            for(int i=0;i<m;i++){
                if(mat[i][j]==1) curr++;
            }
            cols[j] = curr;
        }
        int count = 0;
        for(int i=0;i<m;i++){
            int curr = 0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && rows[i]==1 && cols[j]==1) count++;
            }
        }
        return count;
    }
}
