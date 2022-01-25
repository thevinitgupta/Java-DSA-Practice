package Array;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsIn3SortedArrays {
    public static List<Integer> getCommonElements(int[] a, int[] b, int [] c){
        List<Integer> common = new ArrayList<>();
        int m=a.length, n = b.length, l = c.length;
        int i=0,j=0,k=0;
        while(i<m && j<n && k<l){
            if(a[i]==b[j] && b[j]==c[k]) {
                common.add(a[i]);
                i++;j++;k++;
            }
            else {
                if(a[i]<b[j] && a[i]<c[k]) i++;
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int [] a = {2,4,7,8,10};
        int [] b = {3,6,7,14,10,56};
        int [] c = {2,3,4,7,8,10};
        List<Integer> common = getCommonElements(a,b,c);
        System.out.println(common);
    }
}
