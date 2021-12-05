package POTD;
import java.util.*;
public class FindDuplicateRowInABinaryMatrix {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            if(arr.contains(i)) continue;
            for(int j=i+1;j<m;j++){
                if(compare(matrix[i],matrix[j])) arr.add(j);
            }
        }
        Collections.sort(arr);
        return arr;
    }
    public static boolean compare(int [] a,int [] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}
