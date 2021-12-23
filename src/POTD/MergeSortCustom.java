package POTD;

public class MergeSortCustom {
    void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int[] merged = new int[r-l+1];
        int idx1 = l;
        int idx2 = m+1;
        int x = 0;
        while(idx1 <=m && idx2 <= r){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= m){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= r){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=l; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l >= r) return;
        else{
            int mid = l + (r - l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
