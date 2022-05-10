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

    //simple insertion / deletion sort
//    public static void sort(int [] arr, int n){
//        int end = n-1;
//        for(;end>1;end--){
//            delete(arr,end);
//        }
//    }

    public static void sort(int [] arr, int n){
        for(int i=n/2;i>=1;i--){
            maxHeapify(arr,i,n);
        }
        System.out.println(Arrays.toString(arr));
        int end = n-1;
        for(;end>=1;end--){
            int temp = arr[end];
            arr[end] = arr[1];
            arr[1] = temp;
            maxHeapify(arr,1,end);
        }
    }

    private static void maxHeapify(int [] arr, int pos, int end){
        int l = pos*2, r = pos*2 + 1, largest = pos;
        if(l<end && arr[l]>arr[pos]){
            largest = l;
        }
        if(r<end && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest!=pos){
            int temp = arr[pos];
            arr[pos] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr,largest,end);
        }
    }

    public static void main(String[] args) {
        int [] arr = {-1,10,20,15,1001,30,40,0};
//        System.out.println(Arrays.toString(arr));
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
