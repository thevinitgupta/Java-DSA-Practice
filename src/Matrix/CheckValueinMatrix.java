package Matrix;
import java.util.*;

public class CheckValueinMatrix {
    public static String [][] replaceMatrix(String[][] mat){
        int n = mat[0].length;

        for(int i=0;i<n;i++){
            StringBuilder curr = new StringBuilder(mat[0][i]);
            String nums = "";
            int j=0;
            while(j<curr.length()){
                char ch = curr.charAt(j);
                if(ch>=48 && ch<=57) {
                    curr.deleteCharAt(j);
                    nums += ch;
                }
                else j++;
            }
            //System.out.println(nums+", "+curr);
            boolean found = false;
            for(j=0;j<n;j++){
                if(mat[1][j].equals(nums)) {
                    mat[1][j] = mat[1][i];
                    mat[1][i] = curr.toString();
                    mat[0][i] = nums;
                    found=true;
                }
            }
            if(!found){
                mat[0][i] = "NA";
                mat[1][i] = "NA";
            }
        }
        return mat;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<2;i++){
//            String inp = sc.nextLine();
//
//        }
        String [][] mat = {{"mo3s","t123rn","1tq3"},{"13","3","45"}};

        mat = replaceMatrix(mat);
        int n = mat[0].length;
        for(int i=0;i<2;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(mat[i][j]+",");
            }
            System.out.print(mat[i][n-1]);
            System.out.println();
        }
    }
}
