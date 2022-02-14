package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static int [] sort(int [] arr, int l, int r){
        //System.out.println(l+", "+r);
        if(l<r) {
            int pivot = partition(arr,l,r);
            System.out.println(Arrays.toString(arr)+"=> "+arr[pivot]);
            sort(arr,l,pivot-1);
            sort(arr,pivot+1,r);
        }
        return arr;
    }
    public static int partition(int []arr, int l, int r){
        int i=0,j=0,pivot = r;
        while(i<r && j<r){
            if(arr[j]<=arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        return i;
    }

    public static void main(String[] args) {
        int [] arr = {3,6,1,8,2};
        System.out.println(Arrays.toString(sort(arr,0,arr.length-1)));
    }
}
