package InfyTQPrep;

import java.util.Arrays;

public class HeapSort {
    public static int [] insert(int [] arr, int val, int pos){
        arr[pos] = val;
        while(pos/2>0 && arr[pos]>arr[pos/2]){
            arr[pos] = arr[pos/2];
            arr[pos/2] = val;
            pos = pos/2;
        }
        return arr;
    }
    public static void buildHeap(int [] arr, int n){
        int [] heap = new int[n];
        for(int i=1;i<n;i++){
            heap = insert(arr,arr[i], i);
        }
        arr = heap;
    }

    public static void main(String[] args) {
        int [] arr = {-1,10,20,15,30,40};
        buildHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
