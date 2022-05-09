package InfyTQPrep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static int [] quickSort(int [] a, int low, int high){
        if(low<high){
            int pi = partition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }
        return a;
    }

    public static int partition(int [] a, int low, int high){
        int i= 0, j=0, pi = high;
        System.out.println(a[pi]);
        while(j<pi){
            if(a[j]<=a[pi]) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i=i+1;
            }
            j++;
        }
        int temp = a[i];
        a[i] = a[pi];
        a[pi] = temp;
        System.out.println(Arrays.toString(a));
        return i;
    }
    public static void main(String[] args) {
        int [] a = {3,6,1,9,2,10};
        a = quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
