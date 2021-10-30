package POTD;
import java.util.Arrays;
public class KthElementInMatrix {
    public static int kthSmallest(int[][]mat,int n,int k)
    {
        int [] flat = new int[n*n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                flat[c] = mat[i][j];
                c++;
            }
        }
        Arrays.sort(flat);
        return flat[k-1];
    }

    public static void main(String[] args) {
        int [][] mat = {{10, 20, 30, 40},{15, 25, 35, 45},{24, 29, 37, 48},{32, 33, 39, 50}};
        System.out.println(kthSmallest(mat,4,7));
    }
}
