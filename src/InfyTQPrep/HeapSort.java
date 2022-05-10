package InfyTQPrep;

import java.util.Arrays;

public class HeapSort {
    private static int [] insert(int [] arr, int val, int pos){
        arr[pos] = val;
        while(pos/2>0 && arr[pos]>arr[pos/2]){
            arr[pos] = arr[pos/2];
            arr[pos/2] = val;
            pos = pos/2;
        }
        return arr;
    }
    private static void buildHeap(int [] arr, int n){
        int [] heap = new int[n];
        for(int i=1;i<n;i++){
            heap = insert(arr,arr[i], i);
        }
        arr = heap;
    }

    private static void delete(int arr[], int last){
        int del = arr[1], i=1;
        arr[1] = arr[last];
        while(i*2+1<last){
            int lc = i*2, rc = (i*2)+1;
            if(arr[lc]>arr[rc]){
                int temp = arr[lc];
                arr[lc] = arr[i];
                arr[i] = temp;
                i=lc;
            }
            else {
                int temp = arr[rc];
                arr[rc] = arr[i];
                arr[i] = temp;
                i=rc;
            }
        }
        arr[last] = del;
    }

    public static void sort(int [] arr, int n){
        int end = n-1;
        for(;end>1;end--){
            delete(arr,end);
        }
    }

    public static void main(String[] args) {
        int [] arr = {-1,10,20,15,30,40};
        buildHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
